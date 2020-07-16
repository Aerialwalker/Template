package com.yc.template.Entity;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@GenericGenerator(name = "jpa-uuid", strategy = "uuid")
public class Standard {
    @Id
    @GeneratedValue(generator = "jpa-uuid")
    private String id;
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
}
