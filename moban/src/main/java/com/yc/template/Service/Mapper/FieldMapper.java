package com.yc.template.Service.Mapper;

import com.yc.template.Entity.Field;
import com.yc.template.Service.DTO.FieldDTO;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class FieldMapper {
    public FieldDTO converterDTO(Field field){
        FieldDTO fieldDTO = new FieldDTO();
        fieldDTO.setFieldName(field.getFieldName());
        fieldDTO.setOrderId(field.getOrderId());
        return fieldDTO;
    }
    public Field converterDO(FieldDTO fieldDTO){
        Field field = new Field();
        field.setFieldName(fieldDTO.getFieldName());
        field.setOrderId(fieldDTO.getOrderId());
        return field;
    }
}
