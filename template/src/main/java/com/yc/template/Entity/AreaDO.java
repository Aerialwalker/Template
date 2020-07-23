package com.yc.template.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.yc.template.Service.DTO.FieldDTO;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "yc_area")
public class AreaDO extends AbstractAuditingEntity implements Serializable {
    @Column(name = "area_name")
    private String areaName;

    @JsonBackReference
    @ManyToOne(fetch = FetchType.LAZY,targetEntity = TemplateDO.class)
    @JoinColumn(name = "template_id",referencedColumnName = "id")
    private TemplateDO templateDO;

    @JsonManagedReference
    @OneToMany(mappedBy = "areaDO",cascade = CascadeType.ALL,orphanRemoval =true)
    @OrderBy("orderId ASC")
    @Fetch(FetchMode.SUBSELECT)
    private List<FieldDO> fieldList = new ArrayList();

    @Column(name = "order_id")
    private Integer orderId;

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public TemplateDO getTemplateDO() {
        return templateDO;
    }

    public void setTemplateDO(TemplateDO templateDO) {
        this.templateDO = templateDO;
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
