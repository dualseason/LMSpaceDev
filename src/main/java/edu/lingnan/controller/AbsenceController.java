package edu.lingnan.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import edu.lingnan.dto.AbsenceInfo;
import edu.lingnan.entity.Absence;
import edu.lingnan.service.AbsenceService;
import edu.lingnan.vo.Request;
import edu.lingnan.vo.Result;
import io.swagger.annotations.Api;
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
    @GetMapping("/queryAllAbsences")
    public Result queryAllAbsences(){
        List<Absence> absences = absenceService.queryAllAbsences();
        if(absences.size() > 0){
            return new Result("200",absences,"操作成功");
        }
        else{
            return new Result("0","null","操作失败");
        }
    }
    @PostMapping("/addOneAbsence")
    public Result addOneAbsence(@RequestBody Request request){
        Object data = request.getData();
        log.info("data=>{}",data);
        ObjectMapper objectMapper = new ObjectMapper();
        AbsenceInfo absenceInfo = objectMapper.convertValue(data, AbsenceInfo.class);
        log.info("absenceInfo=>{}",absenceInfo);
        int i = absenceService.addOneAbsence(absenceInfo);
        if(i > 0){
            return new Result("200",absenceInfo,"操作成功");
        }else {
            return new Result("0",absenceInfo,"操作失败");
        }
    }
}
