package com.yc.template.Service.DTO;

import com.yc.template.Entity.Area;
import lombok.Data;

import java.util.List;

@Data
public class TemplateDTO {
    private String templateName;
    private String discription;
    private List<Area> areaList;


}
