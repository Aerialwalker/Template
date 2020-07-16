package com.yc.model.Entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Table(name = "yc_area")

public class Area {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long area_id;

    private String area_name;

    @ManyToOne
    @JoinColumn(name = "model_Id",referencedColumnName = "model_id")
    private Model model;

    @OneToMany(mappedBy = "model_area",cascade = CascadeType.ALL)
    private List<Ziduan> ziduanList;




}
