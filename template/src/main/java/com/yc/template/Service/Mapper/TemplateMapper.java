package com.yc.template.Service.Mapper;

import com.yc.template.Entity.TemplateDO;
import com.yc.template.Service.DTO.TemplateDTO;
import org.springframework.stereotype.Service;

@Service
public class TemplateMapper {
    public TemplateDTO converterDTO(TemplateDO templateDO){
        TemplateDTO templateDTO = new TemplateDTO();
        templateDTO.setTemplateName(templateDO.getTemplateName());
        templateDTO.setDiscription(templateDO.getDiscription());
        templateDTO.setAreaList(templateDO.getAreaList());
        templateDTO.setAreaCount(templateDO.getAreaCount());
        return templateDTO;
    }

    public TemplateDO converterDO(TemplateDTO templateDTO){
        TemplateDO templateDO = new TemplateDO();
        templateDO.setTemplateName(templateDTO.getTemplateName());
        templateDO.setDiscription(templateDTO.getDiscription());
        templateDO.setAreaList(templateDTO.getAreaList());
        templateDO.setAreaCount(templateDTO.getAreaCount());
        return templateDO;

    }


}
