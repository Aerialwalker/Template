package com.yc.template.Entity;
import com.fasterxml.jackson.annotation.JsonBackReference;
import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "yc_field")
public class FieldDO extends AbstractAuditingEntity implements Serializable {
    @Column(name = "field_name")
    private String fieldName;

    @JsonBackReference
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "area_id",referencedColumnName = "id")
    private AreaDO areaDO;

    @Column(name = "orderId")
    private Integer orderId;

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public AreaDO getAreaDO() {
        return areaDO;
    }

    public void setAreaDO(AreaDO areaDO) {
        this.areaDO = areaDO;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }
}
