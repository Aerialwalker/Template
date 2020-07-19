package com.yc.template.Service.DTO;

import com.yc.template.Entity.FieldDO;
import com.yc.template.Entity.TemplateDO;

import java.util.List;

public class AreaDTO {
    private String areaName;
    private TemplateDO template;
    private List<FieldDO> fieldList;
    private Integer orderId;

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public TemplateDO getTemplate() {
        return template;
    }

    public void setTemplate(TemplateDO template) {
        this.template = template;
    }

    public List<FieldDO> getFieldList() {
        return fieldList;
    }

    public void setFieldList(List<FieldDO> fieldList) {
        this.fieldList = fieldList;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }
}
