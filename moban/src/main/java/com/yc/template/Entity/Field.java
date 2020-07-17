package com.yc.template.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@Table(name = "yc_field")
public class Field extends AbstractAuditingEntity implements Serializable {
    @Column(name = "field_name")
    private String fieldName;

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "area_id",referencedColumnName = "id")
    private Area area;

    @Column(name = "order_id")
    private long orderId;
}
