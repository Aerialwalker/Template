package com.yc.template.Service.DTO;

import com.yc.template.Entity.Area;
import io.swagger.annotations.ApiModel;
import lombok.Data;

import java.util.List;

@Data
@ApiModel("模板类")
public class TemplateDTO {
    private String templateName;
    private String discription;
    private List<Area> areaList;



}
