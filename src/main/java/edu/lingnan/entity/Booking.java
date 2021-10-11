package edu.lingnan.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Booking {
    private Integer bId;
    private String sId;
    private String bStartTime;
    private String bEndTime;
    private Integer seatId;
    private Boolean bUseful;
}
