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
@GenericGenerator(name = "jpa-uuid", strategy = "uuid")
public class Area  extends Standard implements Serializable {
    @Id
    @GeneratedValue(generator = "jpa-uuid")
    @Column(name = "area_id")
    private long areaId;
    @Column(name = "area_name")
    private String areaName;

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "template_id",referencedColumnName = "template_id")
    private Template template;

    @JsonManagedReference
    @OneToMany(mappedBy = "area",cascade = CascadeType.ALL)
    private List<Field> fieldList;
}
