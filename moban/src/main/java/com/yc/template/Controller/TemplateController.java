package com.yc.template.Controller;

import com.yc.template.Entity.Template;
import com.yc.template.Service.DTO.TemplateDTO;
import com.yc.template.Service.TemplateService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
@ResponseBody
public class TemplateController {
    @Resource
    public TemplateService templateService;

    @RequestMapping("/findAll")
    public @ResponseBody
    List<TemplateDTO> findAll() {
        return templateService.findAll();
    }

    @RequestMapping("/findById/{id}")
    public @ResponseBody List<TemplateDTO> findById( @PathVariable String id){
        return templateService.findById(id);
    }

}


