package com.yc.template.Service.Mapper;
import com.yc.template.Entity.Area;
import java.util.ArrayList;

import com.yc.template.Entity.Template;
import com.yc.template.Service.DTO.TemplateDTO;
import org.springframework.stereotype.Service;

@Service
public class TemplateMapper {
    public TemplateDTO converterDTO(Template template){
        TemplateDTO templateDTO = new TemplateDTO();
        templateDTO.setTemplateName(template.getTemplateName());
        templateDTO.setDiscription(template.getDiscription());
        templateDTO.setAreaList(template.getAreaList());
        return templateDTO;
    }
    public Template converterDO(TemplateDTO templateDTO){
        Template template = new Template();
        template.setTemplateName(templateDTO.getTemplateName());
        template.setDiscription(templateDTO.getDiscription());
        template.setAreaList(templateDTO.getAreaList());
        return template;
    }
}
