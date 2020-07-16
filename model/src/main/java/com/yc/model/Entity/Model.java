package com.yc.model.Entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Data
@Table(name = "yc_model")
public class Model {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long model_id;
    @Column(nullable = false, unique =true)
    private String model_name;

    @Temporal(TemporalType.TIMESTAMP)
    private String creater_name;
    private Date create_time;
    @Temporal(TemporalType.TIMESTAMP)
    private String changer_name;
    private Date change_time;

    @OneToMany(mappedBy = "model",cascade = CascadeType.ALL)
    private List<Area> areaList;

}
