package com.yc.template.Controller;

import com.yc.template.Entity.Template;
import com.yc.template.Service.TemplateService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
@ResponseBody
public class TemplateController {
    @Resource
    public TemplateService templateService;

    @RequestMapping("/findALL")
    public @ResponseBody List<Template> findAll(){
        return templateService.findAll();
        }
    }


