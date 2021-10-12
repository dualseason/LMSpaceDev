package edu.lingnan.mapper;

import edu.lingnan.entity.ClassRoom;

import java.util.List;

public interface RoomMapper {
    /**
     * 查询可预约教室列表
     * @return
     */
    List<ClassRoom> queryRoomList();
}
