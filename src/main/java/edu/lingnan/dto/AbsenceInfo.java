package edu.lingnan.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@ApiModel(value = "AbsenceInfo")
public class AbsenceInfo {
    @JsonProperty("bId")
    @ApiModelProperty(name = "bId",value = "预定表ID",required = false)
    private Integer bId;
    @JsonProperty("aTime")
    @ApiModelProperty(name = "aTime",value = "缺席时间",required = true)
    private String aTime;
    @JsonProperty("todayStatus")
    @ApiModelProperty(name = "todayStatus",value = "今日状态",required = true)
    private String todayStatus;
}
