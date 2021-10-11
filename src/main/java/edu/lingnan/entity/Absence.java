package edu.lingnan.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Absence {
    private Integer aId;
    private Integer bId;
    private String aTime;
}
