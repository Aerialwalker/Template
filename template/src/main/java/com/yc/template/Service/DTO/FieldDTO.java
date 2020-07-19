package com.yc.template.Service.DTO;

import com.yc.template.Entity.AreaDO;

public class FieldDTO {
    private String fieldName;
    private AreaDO area;
    private Integer orderId;

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public AreaDO getArea() {
        return area;
    }

    public void setArea(AreaDO area) {
        this.area = area;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }
}
