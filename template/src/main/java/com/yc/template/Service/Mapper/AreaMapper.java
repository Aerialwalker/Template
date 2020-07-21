package com.yc.template.Service.Mapper;

import com.yc.template.Entity.AreaDO;
import com.yc.template.Entity.FieldDO;
import com.yc.template.Entity.TemplateDO;
import com.yc.template.Service.DTO.AreaDTO;
import com.yc.template.Service.DTO.FieldDTO;
import com.yc.template.Service.DTO.TemplateDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AreaMapper {
    @Autowired
    private FieldMapper fieldMapper;

    public AreaDTO converterDTO(AreaDO areaDO){
        AreaDTO areaDTO = new AreaDTO();
        areaDTO.setAreaName(areaDO.getAreaName());

        List<FieldDTO> list=new ArrayList();
        List<FieldDO> fieldList = areaDO.getFieldList();
        for(FieldDO fieldDO:fieldList){
            list.add(fieldMapper.converterDTO(fieldDO)) ;
        }
        areaDTO.setFieldList(list);

        areaDTO.setOrderId(areaDO.getOrderId());
        return areaDTO;
    }

    public AreaDO converterDO(AreaDTO areaDTO, TemplateDO templateDO){
        AreaDO areaDO = new AreaDO();
        areaDO.setAreaName(areaDTO.getAreaName());

        List<FieldDO> list=new ArrayList();
        List<FieldDTO> fieldList = areaDTO.getFieldList();
        for(FieldDTO fieldDTO:fieldList){
            list.add(fieldMapper.converterDO(fieldDTO,areaDO)) ;
        }
        areaDO.setTemplateDO(templateDO);
        areaDO.setFieldList(list);
        areaDO.setOrderId(areaDTO.getOrderId());
        return areaDO;

    }
}
