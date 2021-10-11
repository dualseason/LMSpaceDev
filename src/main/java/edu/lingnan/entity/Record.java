package edu.lingnan.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Record {
    private Integer reId;
    private String reStartTime;
    private String reDays;
    private Integer bId;
}
