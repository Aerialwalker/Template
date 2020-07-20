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
    private String discription;
    @ApiModelProperty("区域")
    private List<AreaDO> areaList;
    private Integer areaCount;

    public String getTemplateName() {
        return templateName;
    }

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    public String getDiscription() {
        return discription;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }

    public List<AreaDO> getAreaList() {
        return areaList;
    }

    public void setAreaList(List<AreaDO> areaList) {
        this.areaList = areaList;
    }

    public Integer getAreaCount() {
        return areaCount;
    }

    public void setAreaCount(Integer areaCount) {
        this.areaCount = areaCount;
    }
}
