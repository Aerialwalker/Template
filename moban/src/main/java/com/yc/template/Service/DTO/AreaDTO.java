package com.yc.template.Service.DTO;

import com.yc.template.Entity.Field;
import com.yc.template.Entity.Template;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

@Data
@ApiModel("区域类")
public class AreaDTO {
    @ApiModelProperty("区域名")
    private String areaName;
    private Template template;
    private List<Field> fieldList;
    private long orderId;

}
