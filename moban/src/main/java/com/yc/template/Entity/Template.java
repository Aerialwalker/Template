package com.yc.template.Entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.stereotype.Controller;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Data
@Table(name="yc_template")
@GenericGenerator(name = "jpa-uuid", strategy = "uuid")
public class Template extends Standard implements Serializable {
    @Id
    @GeneratedValue(generator = "jpa-uuid")
    @Column(name = "template_id")
    private String id;
    @Column(name = "template_name")
    private String templateName;
    @Column(name = "create_name")
    private String createName;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "create_time")
    private Date createTime;
    @Column(name = "change_name")
    private String changeName;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "change_time")
    private Date changeTime;

    @JsonManagedReference
    @OneToMany(mappedBy = "template",cascade = CascadeType.ALL)
    private List<Area> areaList;
}


