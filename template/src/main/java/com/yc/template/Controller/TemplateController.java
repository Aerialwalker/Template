package com.yc.template.Controller;

import com.yc.template.Service.DTO.TemplateDTO;
import com.yc.template.Service.TemplateService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class TemplateController {
    @Resource
    public TemplateService templateService;

    @GetMapping("/findAll")
    public @ResponseBody List<TemplateDTO> findAll(){
        return templateService.findAll();
    }

    @GetMapping("findById/{id}")
    public @ResponseBody List<TemplateDTO> findById(@PathVariable String id){
        return templateService.findById(id);
    }

    @GetMapping("/findX")
    public @ResponseBody List<TemplateDTO> findAll(@RequestParam String name){
        return templateService.findAll(name);
    }
}
