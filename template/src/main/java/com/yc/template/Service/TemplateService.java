package com.yc.template.Service;

import com.yc.template.Entity.AreaDO;
import com.yc.template.Entity.TemplateDO;
import com.yc.template.Repository.AreaRepository;
import com.yc.template.Repository.TemplateRepository;
import com.yc.template.Service.DTO.AreaDTO;
import com.yc.template.Service.DTO.TemplateDTO;
import com.yc.template.Service.Mapper.AreaMapper;
import com.yc.template.Service.Mapper.TemplateMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.persistence.criteria.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service
public class TemplateService {
    @Autowired
    private TemplateRepository templateRepository;
    @Resource
    public TemplateMapper templateMapper;

    public List<TemplateDTO> findAll(){
        List<TemplateDO> list = templateRepository.findAll();
//        List<Map> countList =templateRepository.findCount();
        List<TemplateDTO> list1 = new ArrayList();
        for(TemplateDO templateDO:list){
//            String x = templateDO.getId();
//            for(Map count:countList){
//                templateDO.setLength(0);
//                if(x.equals(count.get("templateId"))){
//                    templateDO.setLength(Integer.parseInt(String.valueOf((count.get("countId")))));
//                }
//            }
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
