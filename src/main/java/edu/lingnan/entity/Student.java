package edu.lingnan.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private String sId;
    private String sPassword;
    private String sStatus;
    private String sName;
    private String sGrade;
    private String sClass;
    private String sCollege;
}
