package edu.lingnan.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Seat {
    private Integer seatId;
    private String seatNum;
    private Integer rId;
    private String seatStatus;
}
