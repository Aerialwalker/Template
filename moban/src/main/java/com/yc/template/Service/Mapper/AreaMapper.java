package com.yc.template.Service.Mapper;
import com.yc.template.Entity.Area;
import com.yc.template.Entity.Template;
import com.yc.template.Entity.Field;
import java.util.ArrayList;

import com.yc.template.Service.DTO.AreaDTO;
import org.springframework.stereotype.Service;

@Service
public class AreaMapper {
    public AreaDTO converterDTO(Area area){
        AreaDTO areaDTO = new AreaDTO();
        areaDTO.setAreaName(area.getAreaName());
        areaDTO.setFieldList(area.getFieldList());
        areaDTO.setOrderId(area.getOrderId());
        return areaDTO;
    }
    public Area converterDO(AreaDTO areaDTO){
        Area area = new Area();
        area.setAreaName(areaDTO.getAreaName());
        area.setFieldList(areaDTO.getFieldList());
        area.setOrderId(areaDTO.getOrderId());
        return area;
    }
}
