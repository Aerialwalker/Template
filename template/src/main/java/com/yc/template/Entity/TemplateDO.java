package com.yc.template.Entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import io.swagger.annotations.ApiModel;
import io.swagger.models.auth.In;
import org.hibernate.annotations.Formula;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "yc_template")
public class TemplateDO extends AbstractAuditingEntity implements Serializable {
    @Column(name="template_name")
    private String templateName;

    private String discription;

    @Formula("(select count(a.id) from template.yc_area as a where a.template_id=id )")
    private Integer areaCount;

    @JsonManagedReference
    @OrderBy("orderId ASC")
    @OneToMany(mappedBy = "templateDO",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
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

    public Integer getAreaCount() {
        return areaCount;
    }

    public void setAreaCount(Integer areaCount) {
        this.areaCount = areaCount;
    }
}
