package edu.lingnan.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClassRoom {
    private Integer rId;
    private String rRoom;
    private String rStatus;
    private String rBuilding;
    private Integer rCanables;
    private Integer rNums;
}
