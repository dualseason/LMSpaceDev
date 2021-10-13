package edu.lingnan.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import edu.lingnan.dto.RoomDto;
import edu.lingnan.entity.ClassRoom;
import edu.lingnan.entity.Teacher;
import edu.lingnan.service.RoomService;
import edu.lingnan.vo.Request;
import edu.lingnan.vo.Result;
import io.swagger.annotations.Api;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    public Result queryRoomList() {
        List<ClassRoom> classRooms = roomService.queryRoomList();
        if (classRooms.size() > 0) {
            return new Result("200", classRooms, "操作成功");
        }
        return new Result("0", classRooms, "操作失败");
    }

    @PostMapping("/addRoom")
    public Result addRoom(@RequestBody Request request) {
        Object data1 = request.getData();
        ObjectMapper mapper = new ObjectMapper();
        RoomDto roomDto = mapper.convertValue(data1, RoomDto.class);
        log.info("roomDto=>{}",roomDto);
        int i = roomService.addRoom(roomDto);
        if (i > 0) {
            return new Result("200", null, "操作成功");
        }
        return new Result("0", null, "操作失败");
    }

    @GetMapping("/findAllRoom")
    public Result findAllRoom(){
        List<ClassRoom> classRooms = roomService.queryRoomList();
        if (classRooms.size() > 0) {
            return new Result("200", classRooms, "操作成功");
        }
        return new Result("0", classRooms, "操作失败");
    }
}
