package edu.lingnan.service;

import edu.lingnan.dto.PositionInfo;

import java.util.List;

public interface RoomService {
    /**
     * 获取可预约考研室位置信息
     * @return
     */
    List<PositionInfo> queryLocationInfo();
}
