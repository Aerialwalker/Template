package com.yc.template.Service;

import com.yc.template.Entity.Field;
import com.yc.template.Repository.FieldRepository;
import com.yc.template.Service.DTO.FieldDTO;
import com.yc.template.Service.Mapper.FieldMapper;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import javax.persistence.criteria.*;
import java.util.ArrayList;
import java.util.List;


@Service
public class FieldService {
    @Autowired
    private FieldRepository fieldRepository;
    @Resource
    public FieldMapper fieldMapper;


    public List<FieldDTO> Findx(String find){
    Specification<Field> spec = new Specification<Field>() {
        @Override
        public Predicate toPredicate(Root<Field> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {
            Path<Object> fieldName = root.get("fieldName");
            Predicate like = criteriaBuilder.like(fieldName.as(String.class),"%"+find+"%");
            return like;
        }
    };
    List<Field> list = fieldRepository.findAll(spec);
    List<FieldDTO> listDTO = new ArrayList();
    for(Field field : list){
        listDTO.add(fieldMapper.DTOconverter(field));
    }
    return listDTO;
    }
}
