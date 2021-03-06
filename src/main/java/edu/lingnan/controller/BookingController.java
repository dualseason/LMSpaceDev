package edu.lingnan.controller;

import edu.lingnan.controller.result.QueryUserfulBookingListResult;
import edu.lingnan.dto.BookingInfo;
import edu.lingnan.entity.ClassRoom;
import edu.lingnan.service.BookingService;
import edu.lingnan.vo.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Log4j2
@CrossOrigin
@RestController
@RequestMapping("/booking")
@Api
public class BookingController {
    @Autowired
    private BookingService bookingService;

    @ApiOperation(value = "查询有效的预约记录列表")
    @GetMapping("/queryUserfulBookingList")
    public Result queryUserfulBookingList() {
        List<BookingInfo> bookingInfos = bookingService.queryUserfulBookingList();
        if(bookingInfos.size()>0){
            QueryUserfulBookingListResult result = new QueryUserfulBookingListResult();
            result.setBookingInfos(bookingInfos);
            result.setResCode("200");
            result.setMessage("操作成功");
            return result;
        }
        else{
            QueryUserfulBookingListResult result = new QueryUserfulBookingListResult();
            result.setMessage("操作失败");
            result.setResCode("0");
            return result;
        }
    }
}
