package com.yc.model.Entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "yc_ziduan")

public class Ziduan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long ziduan_id;

    @Column(nullable = false,unique = true)
    private String ziduan_name;

    @ManyToOne()
    @JoinColumn(name = "area_id",referencedColumnName = "area_id")
    private Area area;

}
