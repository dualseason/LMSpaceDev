package edu.lingnan.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(value = "Absence")
public class Absence {
    @ApiModelProperty(name = "aId",value = "缺席表ID",required = false)
    private Integer aId;
    @ApiModelProperty(name = "bId",value = "预定表ID",required = true)
    private Integer bId;
    @ApiModelProperty(name = "aTime",value = "缺席时间",required = true)
    private String aTime;
}
