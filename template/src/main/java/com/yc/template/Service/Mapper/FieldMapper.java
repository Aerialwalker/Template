package com.yc.template.Service.Mapper;

import com.yc.template.Entity.AreaDO;
import com.yc.template.Entity.FieldDO;
import com.yc.template.Service.DTO.AreaDTO;
import com.yc.template.Service.DTO.FieldDTO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class FieldMapper {
    public FieldDTO converterDTO(FieldDO fieldDO){
        FieldDTO fieldDTO = new FieldDTO();
        fieldDTO.setId(fieldDO.getId());
        fieldDTO.setFieldName(fieldDO.getFieldName());
        fieldDTO.setOrderId(fieldDO.getOrderId());
        return fieldDTO;
    }

    public FieldDO converterDO(FieldDTO fieldDTO, AreaDO areaDO){
        FieldDO fieldDO = new FieldDO();
        fieldDO.setFieldName(fieldDTO.getFieldName());
        fieldDO.setAreaDO(areaDO);
        fieldDO.setOrderId(fieldDTO.getOrderId());
        return fieldDO;

    }

    public List<FieldDO> updateField(List<FieldDO> listFDO,List<FieldDTO> listFDTO,AreaDO areaDO){
        Map<String,FieldDO> mapFDO = new HashMap<>();
        for(int i =0;i<listFDO.size();i++){
            mapFDO.put(listFDO.get(i).getId(),listFDO.get(i));
        }
        List<FieldDO> newList = new ArrayList();
            for (int i = 0; i < listFDTO.size(); i++) {
                String dtoId = listFDTO.get(i).getId();
                FieldDO fieldDO = mapFDO.get(dtoId);
                FieldDTO fieldDTO = listFDTO.get(i);

                if(dtoId==null){
                    newList.add(converterDO(listFDTO.get(i), areaDO));
                    continue;
                }
                if(mapFDO.get(dtoId)==null){
                    newList.add(converterDO(listFDTO.get(i), areaDO));
                    continue;
                }
                if(mapFDO.get(dtoId)!=null){
                    mapFDO.get(dtoId).setFieldName(fieldDTO.getFieldName());
                    mapFDO.get(dtoId).setOrderId(fieldDTO.getOrderId());
                    mapFDO.get(dtoId).setAreaDO(fieldDO.getAreaDO());
                    newList.add(mapFDO.get(dtoId));
                    continue;

                }
            }
            listFDO.clear();
            for (int i = 0; i < newList.size(); i++) {
                listFDO.add(i,newList.get(i));
            }
        return listFDO;
    }
}
