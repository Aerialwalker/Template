package com.yc.template.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Data
@Table(name = "yc_area")
public class Area implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long quyu_id;

    private String quyu_name;

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "moban_id",referencedColumnName = "moban_id")
    private Template template;

    @JsonManagedReference
    @OneToMany(mappedBy = "area",cascade = CascadeType.ALL)
    private List<Field> fieldList;
}
