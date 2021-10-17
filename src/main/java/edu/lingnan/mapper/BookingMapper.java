package edu.lingnan.mapper;

import edu.lingnan.dto.BookingInfo;

import java.util.List;

public interface BookingMapper {
    /**
     * 查询现阶段正在被预约的记录
     * @return
     */
    List<BookingInfo> queryUserfulBookingList();
}
