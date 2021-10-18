package edu.lingnan.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookingInfo {
    @ApiModelProperty(value = "bId",name = "bId")
    private Integer bId;
    @ApiModelProperty(value = "seatId",name = "seatId")
    private Integer seatId;
    @ApiModelProperty(value = "rRoom",name = "rRoom")
    private String rRoom;
    @ApiModelProperty(value = "rBuilding",name = "rBuilding")
    private String rBuilding;
    /**
     * 当天缺勤状态
     */
    @ApiModelProperty(value = "todayStatus",name = "todayStatus")
    private boolean todayStatus;
}
