package com.yc.moban.Entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Data
@Table(name="yc_moban")
public class Moban implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long moban_id;

    private String moban_name;

    //@Temporal(TemporalType.TIMESTAMP)
    private String creater_name;
    private Date create_time;
    //@Temporal(TemporalType.TIMESTAMP)
    private String changer_name;
    private Date change_time;

    @JsonManagedReference
    @OneToMany(mappedBy = "moban",cascade = CascadeType.ALL)
    private List<Quyu> quyuList;



}


