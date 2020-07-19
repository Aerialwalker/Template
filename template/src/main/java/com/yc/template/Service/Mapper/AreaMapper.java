package com.yc.template.Service.Mapper;

import com.yc.template.Entity.AreaDO;
import com.yc.template.Service.DTO.AreaDTO;
import org.springframework.stereotype.Service;

@Service
public class AreaMapper {
    public AreaDTO converterDTO(AreaDO areaDO){
        AreaDTO areaDTO = new AreaDTO();
        areaDTO.setAreaName(areaDO.getAreaName());
        areaDTO.setFieldList(areaDO.getFieldList());
        areaDTO.setOrderId(areaDO.getOrderId());
        return areaDTO;
    }

    public AreaDO converterDO(AreaDTO areaDTO){
        AreaDO areaDO = new AreaDO();
        areaDO.setAreaName(areaDTO.getAreaName());
        areaDO.setFieldList(areaDTO.getFieldList());
        areaDO.setOrderId(areaDTO.getOrderId());
        return areaDO;

    }
}
