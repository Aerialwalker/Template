package com.yc.template.Service.Mapper;

import com.yc.template.Entity.AreaDO;
import com.yc.template.Entity.FieldDO;
import com.yc.template.Entity.TemplateDO;
import com.yc.template.Service.DTO.AreaDTO;
import com.yc.template.Service.DTO.FieldDTO;
import com.yc.template.Service.DTO.TemplateDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class AreaMapper {
    @Autowired
    private FieldMapper fieldMapper;

    public AreaDTO converterDTO(AreaDO areaDO){
        AreaDTO areaDTO = new AreaDTO();
        areaDTO.setId(areaDO.getId());
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
        if(fieldList!=null){
        for(FieldDTO fieldDTO:fieldList){
            list.add(fieldMapper.converterDO(fieldDTO,areaDO)) ;
        }}
        areaDO.setTemplateDO(templateDO);
        areaDO.setFieldList(list);
        areaDO.setOrderId(areaDTO.getOrderId());
        return areaDO;
    }




    public List<AreaDO> updateArea(List<AreaDO> listDO,List<AreaDTO> listDTO,TemplateDO templateDO){
        Map<String,AreaDO> mapDO = new HashMap<>();
        for(int i =0;i<listDO.size();i++){
            mapDO.put(listDO.get(i).getId(),listDO.get(i));
        }
        List<AreaDO> newList = new ArrayList();
        for(int i=0;i<listDTO.size();i++){
            String dtoId = listDTO.get(i).getId();
            AreaDO areaDO = mapDO.get(dtoId);
            AreaDTO areaDTO = listDTO.get(i);
            if(dtoId==null){
                newList.add(converterDO(listDTO.get(i), templateDO));
                continue;
            }
            if(mapDO.get(dtoId)==null){
                newList.add(converterDO(listDTO.get(i), templateDO));
                continue;
            }
            List<FieldDO> listFDO = areaDO.getFieldList();
            List<FieldDTO> listFDTO = areaDTO.getFieldList();

            if(mapDO.get(dtoId)!=null){
                mapDO.get(dtoId).setAreaName(areaDTO.getAreaName());
                mapDO.get(dtoId).setOrderId(areaDTO.getOrderId());
                mapDO.get(dtoId).setTemplateDO(areaDO.getTemplateDO());
                fieldMapper.updateField(listFDO,listFDTO,areaDO);
                newList.add(mapDO.get(dtoId));
                continue;
            }
        }
        listDO.clear();
        for (int i = 0; i < newList.size(); i++) {
            listDO.add(i,newList.get(i));
        }
        return listDO;
    }






}
