package edu.lingnan.controller;

import edu.lingnan.service.SeatService;
import edu.lingnan.vo.Result;
import io.swagger.annotations.Api;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Log4j2
@CrossOrigin
@RestController
@RequestMapping("/seat")
@Api
public class SeatController {
    @Autowired
    private SeatService seatService;

    @PostMapping("/getSeatReq")
    public Result GetSeatReq() {
        return null;
    }

    @PostMapping("/renewalSeat")
    public Result RenewalSeat() {
        return null;
    }

    @PostMapping("/cancelSeat")
    public Result CancelSeat() {
        return null;
    }

    @PostMapping("/queryAllSeat")
    public Result QueryAllSeat(){
        return null;
    }
}
