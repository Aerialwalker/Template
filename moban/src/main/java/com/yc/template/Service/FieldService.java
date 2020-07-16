package com.yc.template.Service;

import com.yc.template.Entity.Field;
import com.yc.template.Repository.FieldRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import javax.persistence.criteria.*;
import java.util.List;


@Service
public class FieldService {
    @Autowired
    private FieldRepository fieldRepository;

    public List<Field> Findx(String find){
    Specification<Field> spec = new Specification<Field>() {
        @Override
        public Predicate toPredicate(Root<Field> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {
            Path<Object> fieldName = root.get("fieldName");
            Predicate like = criteriaBuilder.like(fieldName.as(String.class),"%"+find+"%");
            return like;
        }
    };
    List<Field> list = fieldRepository.findAll(spec);
    return list;
}
}
