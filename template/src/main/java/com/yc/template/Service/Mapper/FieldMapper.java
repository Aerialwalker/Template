package com.yc.template.Service.Mapper;

import com.yc.template.Entity.FieldDO;
import com.yc.template.Service.DTO.FieldDTO;
import org.springframework.stereotype.Service;

@Service
public class FieldMapper {
    public FieldDTO converterDTO(FieldDO fieldDO){
        FieldDTO fieldDTO = new FieldDTO();
        fieldDTO.setFieldName(fieldDO.getFieldName());
        fieldDTO.setOrderId(fieldDO.getOrderId());
        return fieldDTO;
    }

    public FieldDO converterDO(FieldDTO fieldDTO){
        FieldDO fieldDO = new FieldDO();
        fieldDO.setFieldName(fieldDTO.getFieldName());
        fieldDO.setOrderId(fieldDTO.getOrderId());
        return fieldDO;

    }

}
