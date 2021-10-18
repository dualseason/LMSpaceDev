package edu.lingnan.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import edu.lingnan.config.*;
import edu.lingnan.controller.model.AddOneAbsenceRequest;
import edu.lingnan.dto.AbsenceInfo;
import edu.lingnan.entity.Absence;
import edu.lingnan.service.AbsenceService;
import edu.lingnan.vo.Request;
import edu.lingnan.vo.Result;
import io.swagger.annotations.*;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author dualseason
 */
@RestController
@Log4j2
@Api
@CrossOrigin
@RequestMapping("/absence")
public class AbsenceController {
    @Autowired
    private AbsenceService absenceService;

    /**
     * 文档使用请参考 : https://blog.dualseason.com/index.php/archives/166/
     * @param request
     * @return
     */
    @ApiOperation(value = "增加一个缺席记录")
    @PostMapping("/addOneAbsence")
    @ApiJsonModel({
            @ApiModelProperty(name = "bId", value = "预约编号",example = "21",required = true),
            @ApiModelProperty(name = "aTime", value = "当天日期",example = "2021-10-18",required = true),
            @ApiModelProperty(name = "todayStatus", value = "当天状态",example = "true",required = true)
    })
    public Result addOneAbsence(@RequestBody AddOneAbsenceRequest request){
        AbsenceInfo absenceInfo = new AbsenceInfo();
        absenceInfo.setATime(request.getATime());
        absenceInfo.setBId(request.getBId());
        absenceInfo.setTodayStatus(request.getTodayStatus());
        int i = absenceService.addOneAbsence(absenceInfo);
        if(i > 0){
            absenceInfo.setResCode("200");
            absenceInfo.setMessage("操作成功");
            return absenceInfo;
        }else {
            absenceInfo.setResCode("0");
            absenceInfo.setMessage("操作失败");
            return absenceInfo;
        }
    }
}
