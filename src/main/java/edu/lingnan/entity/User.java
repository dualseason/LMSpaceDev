package edu.lingnan.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable{
    private static final long serialVersionUID = 2892776464231343313L;
    private Integer uid;
    private String uname;
    private String ugender;
    private Integer uage;
}
