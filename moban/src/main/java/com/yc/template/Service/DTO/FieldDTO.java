package com.yc.template.Service.DTO;

import com.yc.template.Entity.Area;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel("字段类")
public class FieldDTO {
    @ApiModelProperty("字段名")
    private String fieldName;
    private Area area;
    private long orderId;
}
