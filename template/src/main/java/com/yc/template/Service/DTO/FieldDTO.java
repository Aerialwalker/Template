package com.yc.template.Service.DTO;

import com.yc.template.Entity.AreaDO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("字段类")
public class FieldDTO {
    private String id;

    @ApiModelProperty("模板名")
    private String fieldName;

    @ApiModelProperty("排序ID")
    private Integer orderId;

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
