package com.yc.moban.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Data
@Table(name = "yc_quyu")
public class Quyu implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long quyu_id;

    private String quyu_name;

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "moban_id",referencedColumnName = "moban_id")
    private Moban moban;

    @JsonManagedReference
    @OneToMany(mappedBy = "quyu",cascade = CascadeType.ALL)
    private List<Ziduan> ziduanList;


}
