package edu.lingnan.vo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class Request implements Serializable {
    private static final long serialVersionUID = -4792345454723244385L;
    @JsonProperty("userId")
    private String userId;
    @JsonProperty("userType")
    private String userType;
    @JsonProperty("sign")
    private String sign;
    @JsonProperty("timestamp")
    private String timestamp;
    @JsonProperty("data")
    private Object data;

    /**
     * 当没有用户的时候使用
     * @param sign
     * @param timestamp
     * @param data
     */
    public Request(String sign, String timestamp, Object data) {
        this.sign = sign;
        this.timestamp = timestamp;
        this.data = data;
    }
}
