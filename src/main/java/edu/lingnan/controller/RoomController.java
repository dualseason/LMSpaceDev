package edu.lingnan.controller;

import edu.lingnan.entity.ClassRoom;
import edu.lingnan.service.RoomService;
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
@RequestMapping("/room")
@Api
public class RoomController {
    @Autowired
    private RoomService roomService;

    @GetMapping("/queryRoomList")
    public Result queryRoomList(){
        List<ClassRoom> classRooms = roomService.queryRoomList();
        if (classRooms.size()>0){
            return new Result("200",classRooms,"操作成功");
        }
        return new Result("0",classRooms,"操作失败");
    }
}
