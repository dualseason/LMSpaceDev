package edu.lingnan.service;

import edu.lingnan.entity.ClassRoom;

import java.util.List;

public interface RoomService {
    /**
     * 查询可预约教室列表
     * @return
     */
    List<ClassRoom> queryRoomList();
}
