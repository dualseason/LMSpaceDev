package edu.lingnan.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class Teacher {
    @JsonProperty("tNum")
    private String tNum;
    @JsonProperty("tPassWord")
    private String tPassWord;
    @JsonProperty("tName")
    private String tName;
}
