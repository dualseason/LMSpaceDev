package edu.lingnan.dto;

import edu.lingnan.vo.Result;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookingInfo {
    private Integer bId;
    private Integer seatId;
    private String rRoom;
    private String rBuilding;
    //当天缺勤状态
    private boolean todayStatus;
}
