package com.yc.template.Service;

import com.yc.template.Entity.TemplateDO;
import com.yc.template.Repository.TemplateRepository;
import com.yc.template.Service.DTO.TemplateDTO;
import com.yc.template.Service.Mapper.TemplateMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.persistence.criteria.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class TemplateService {
    @Autowired
    private TemplateRepository templateRepository;
    @Resource
    public TemplateMapper templateMapper;

    public List<TemplateDTO> findAll(){
        List<TemplateDO> list = templateRepository.findAll();
        List<TemplateDTO> list1 = new ArrayList();
        for(TemplateDO templateDO:list){
            templateDO.setAreaList(null);
            list1.add(templateMapper.converterDTO(templateDO));
        }
        return list1;
    }

    public List<TemplateDTO> findById(String id){
        List<TemplateDO> list = templateRepository.findById(id);
        List<TemplateDTO> list1 = new ArrayList();
        for(TemplateDO templateDO:list){
            list1.add(templateMapper.converterDTO(templateDO));
        }
        return list1;
    }

    public List<TemplateDTO> findAll(String name){
        Specification spec = new Specification() {
            @Override
            public Predicate toPredicate(Root root, CriteriaQuery criteriaQuery, CriteriaBuilder criteriaBuilder) {
                Path<Object> templateName = root.get("templateName");
                Predicate like =criteriaBuilder.like(templateName.as(String.class),"%"+name+"%");
                return like;
            }
        };
        List<TemplateDO> list = templateRepository.findAll(spec);
        List<TemplateDTO> list1 = new ArrayList();
        for(TemplateDO templateDO:list){
           list1.add(templateMapper.converterDTO(templateDO));
        }
        return list1;
    }
}
