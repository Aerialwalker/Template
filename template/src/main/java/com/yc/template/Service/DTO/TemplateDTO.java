package com.yc.template.Service.DTO;

import com.yc.template.Entity.AreaDO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

@ApiModel(value = "模板类")
public class TemplateDTO {
    @ApiModelProperty(value ="模板名")
    private String templateName;
    @ApiModelProperty("模板描述")
    private String description;
    @ApiModelProperty("区域")
    private List<AreaDTO> areaList;
    private Integer areaCount;

    public String getTemplateName() {
        return templateName;
    }

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<AreaDTO> getAreaList() {
        return areaList;
    }

    public void setAreaList(List<AreaDTO> areaList) {
        this.areaList = areaList;
    }

    public Integer getAreaCount() {
        return areaCount;
    }

    public void setAreaCount(Integer areaCount) {
        this.areaCount = areaCount;
    }
}
