package com.yc.template.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Data
@Table(name = "yc_area")
public class Area  extends AbstractAuditingEntity implements Serializable {
    @Column(name = "area_name")
    private String areaName;

    @JsonBackReference
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "template_id",referencedColumnName = "id")
    private Template template;

    @JsonManagedReference
    @OrderBy("orderId ASC ")
    @OneToMany(mappedBy = "area",cascade = CascadeType.ALL)
    private List<Field> fieldList;

    @Column(name = "order_id")
    private long orderId;
}
