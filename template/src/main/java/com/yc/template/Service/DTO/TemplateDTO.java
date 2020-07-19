package com.yc.template.Service.DTO;

import com.yc.template.Entity.AreaDO;

import java.util.List;

public class TemplateDTO {
    private String templateName;
    private String discription;
    private List<AreaDO> areaList;

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
}
