package com.yc.template.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "yc_area")
public class AreaDO extends AbstractAuditingEntity implements Serializable {
    @Column(name = "area_name")
    private String areaName;

    @JsonBackReference
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "template_id",referencedColumnName = "id")
    private TemplateDO templateDO;

    @JsonManagedReference
    @OneToMany(mappedBy = "areaDO",cascade = CascadeType.ALL)
    @OrderBy("orderId ASC")
    private List<FieldDO> fieldList;

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
