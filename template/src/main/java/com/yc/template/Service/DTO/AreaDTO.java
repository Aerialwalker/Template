package com.yc.template.Service.DTO;

import com.yc.template.Entity.FieldDO;
import com.yc.template.Entity.TemplateDO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;
@ApiModel("区域类")
public class AreaDTO {
    @ApiModelProperty("区域名")
    private String areaName;
    private TemplateDO template;
    @ApiModelProperty("字段")
    private List<FieldDO> fieldList;
    @ApiModelProperty("区排序ID")
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
