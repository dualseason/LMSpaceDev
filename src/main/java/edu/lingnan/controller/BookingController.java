package edu.lingnan.controller;

import edu.lingnan.dto.BookingInfo;
import edu.lingnan.entity.ClassRoom;
import edu.lingnan.service.BookingService;
import edu.lingnan.vo.Result;
import io.swagger.annotations.Api;
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
    @GetMapping("/queryUserfulBookingList")
    public Result queryUserfulBookingList() {
        List<BookingInfo> bookingInfos = bookingService.queryUserfulBookingList();
        if(bookingInfos.size()>0){
            return new Result("200",bookingInfos,"操作成功");
        }
        else return new Result("0",null,"操作失败");
    }
}
