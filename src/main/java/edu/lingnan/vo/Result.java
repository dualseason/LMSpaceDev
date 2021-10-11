package edu.lingnan.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Result implements Serializable {
    private static final long serialVersionUID = 1539382584314780695L;
    /**
     * 200成功，非200失败
     */
    private String resCode;
    private Object data;
    private String message;
}
