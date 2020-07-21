package com.yc.template.Controller;

import com.yc.template.Entity.TemplateDO;
import com.yc.template.Service.DTO.TemplateDTO;
import com.yc.template.Service.TemplateService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.Set;

@Controller
@RequestMapping("/api")
public class TemplateController {
    @Resource
    public TemplateService templateService;

//    @GetMapping("/templates")
//    @ApiOperation("查询所有模板+模糊查询")
//    public @ResponseBody List<TemplateDTO> findAll(@ApiParam("要查询的字段") TemplateDO templateDO){
//        return templateService.findAll(templateDO);
//    }

    @GetMapping("/templates")
    @ApiOperation("查询所有模板+模糊查询")
    public @ResponseBody List<TemplateDTO> findAll(@ApiParam("要查询的字段") String name){
        return templateService.findAll(name);
    }

    @GetMapping("templates/id/{id}")
    @ApiOperation("根据ID查询")
    public @ResponseBody Set<TemplateDTO> findById(@ApiParam("要查询的ID") @PathVariable String id){
        return templateService.findById(id);
    }

    @PostMapping("template")
    @ApiOperation("增加模板")
    public @ResponseBody String postTemplate(@ApiParam("模板名字") @RequestBody TemplateDTO templateDTO ){
        templateService.postTemplate(templateDTO);
        return "saved";
    }

    @DeleteMapping("template/id/{templateId}")
    @ApiOperation("删除模板")
    public @ResponseBody String deleteTemplate(@ApiParam("要删除的ID") @PathVariable String templateId){
        templateService.deleteTemplate(templateId);
        return "deleted";
    }



}
