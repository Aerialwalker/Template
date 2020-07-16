package com.yc.template.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@Table(name = "yc_field")
@GenericGenerator(name = "jpa-uuid", strategy = "uuid")
public class Field extends Standard implements Serializable {
    @Id
    @GeneratedValue(generator = "jpa-uuid")
    @Column(name = "field_id")
    private String id;
    @Column(name = "field_name")
    private String fieldName;
    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "area_id",referencedColumnName = "area_id")
    private Area area;

}
