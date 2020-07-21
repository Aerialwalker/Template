package com.yc.template.Service;


import com.yc.template.Entity.TemplateDO;
import com.yc.template.Repository.TemplateRepository;
import com.yc.template.Service.DTO.TemplateDTO;
import com.yc.template.Service.Mapper.TemplateMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import javax.persistence.criteria.*;
import java.util.*;

@Service
public class TemplateService {
    @Autowired
    private TemplateRepository templateRepository;
    @Resource
    public TemplateMapper templateMapper;

    public Set<TemplateDTO> findById(String id){
        Set<TemplateDO> list = templateRepository.findById(id);
        Set<TemplateDTO> list1 = new HashSet();
        for(TemplateDO templateDO:list){
            list1.add(templateMapper.converterDtoDetail(templateDO));
        }
        return list1;
    }

    public List<TemplateDTO> findAll(String name){
        List<TemplateDTO> list1 = new ArrayList();
        List<TemplateDO> list = new ArrayList();
        Specification<TemplateDO> spec = null;

        if(name !=null){
             spec = new Specification() {
                @Override
                public Predicate toPredicate(Root root, CriteriaQuery criteriaQuery, CriteriaBuilder cb) {
                    Path<Object> templateName = root.get("templateName");
                    Predicate like =cb.like(templateName.as(String.class),"%"+name+"%");
                    return like;
                }
            };
        }
        list = templateRepository.findAll(spec);
        for(TemplateDO template:list){
            list1.add(templateMapper.converterDtoSimple(template));
        }
        return list1;
    }

    @Transactional
    public void postTemplate(TemplateDTO templateDTO){
        TemplateDO templateDO = templateMapper.converterDO(templateDTO);
        templateRepository.save(templateDO);
    }

    @Transactional
    public void deleteTemplate(String templateId){
        templateRepository.deleteById(templateId);
    }


}
