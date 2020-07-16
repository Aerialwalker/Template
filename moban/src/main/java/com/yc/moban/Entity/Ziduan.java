package com.yc.moban.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@Table(name = "yc_ziduan")

public class Ziduan implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long ziduan_id;

    //@Column(nullable = false,unique = true)
    private String ziduan_name;

    @JsonBackReference
    @ManyToOne()
    @JoinColumn(name = "quyu_id",referencedColumnName = "quyu_id")
    private Quyu quyu;

}
