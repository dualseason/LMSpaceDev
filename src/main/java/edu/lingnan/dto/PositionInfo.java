package edu.lingnan.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PositionInfo {
    private String building;
    private String room;
    private String seat;
    private String state;
}
