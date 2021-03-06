package com.yc.template.Entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import org.hibernate.annotations.*;


import javax.persistence.*;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OrderBy;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@DynamicInsert(true)
@DynamicUpdate()
@Table(name = "yc_template")
@NamedEntityGraph(name ="template.all" ,
        attributeNodes = {
        @NamedAttributeNode(value = "areaList")})
//                ,subgraph = "field.all")},
//        subgraphs = {
//        @NamedSubgraph(name = "field.all",
//                attributeNodes =
//        @NamedAttributeNode (value = "fieldList"))})

public class TemplateDO extends AbstractAuditingEntity implements Serializable {
    @Column(name="template_name")
    private String templateName;

    private String description;

    @Formula("(select count(a.id) from template.yc_area as a where a.template_id=id )")
    private Integer areaCount;

    @JsonManagedReference
    @OrderBy("orderId ASC")
    @OneToMany(mappedBy = "templateDO",cascade = CascadeType.ALL,orphanRemoval =true)
    @Fetch(FetchMode.SUBSELECT)
    private List<AreaDO> areaList = new ArrayList();

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
