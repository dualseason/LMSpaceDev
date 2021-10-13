package edu.lingnan.service;

import edu.lingnan.dto.RoomDto;
import edu.lingnan.entity.ClassRoom;

import java.util.List;

public interface RoomService {
    /**
     * 查询可预约教室列表
     * @return
     */
    List<ClassRoom> queryRoomList();

    /**
     * 增加教室
     * @param room
     * @return
     */
    int addRoom(RoomDto room);
}
