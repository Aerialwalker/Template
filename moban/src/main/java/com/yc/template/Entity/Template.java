package com.yc.template.Entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Data
@Table(name="yc_template")
public class Template extends AbstractAuditingEntity implements Serializable {
    @Column(name = "template_name")
    private String templateName;

    private String discription;

    @JsonManagedReference
    @OrderBy("orderId ASC")
    @OneToMany(mappedBy = "template",cascade = CascadeType.ALL)
    private List<Area> areaList;
}


