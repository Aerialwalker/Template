package com.yc.template.Service.DTO;

import com.yc.template.Entity.Field;
import com.yc.template.Entity.Template;
import lombok.Data;

import java.util.List;

@Data
public class AreaDTO {
    private String areaName;
    private Template template;
    private List<Field> fieldList;
    private long orderId;

}
