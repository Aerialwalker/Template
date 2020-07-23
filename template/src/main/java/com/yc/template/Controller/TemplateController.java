package com.yc.template.Controller;


import com.yc.template.Repository.TemplateRepository;
import com.yc.template.Service.DTO.TemplateDTO;
import com.yc.template.Service.Mapper.TemplateMapper;
import com.yc.template.Service.TemplateService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

import java.util.Collections;
import java.util.List;


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
    public @ResponseBody List<TemplateDTO> findById(@ApiParam("要查询的ID") @PathVariable String id){
        List<TemplateDTO> list = Collections.singletonList(templateService.findById(id));
        return list;
    }

    @PostMapping("/templates")
    @ApiOperation("增加模板")
    public @ResponseBody String postTemplate(@ApiParam("模板名字") @RequestBody TemplateDTO templateDTO ){
        templateService.postTemplate(templateDTO);
        return "saved";
    }

    @DeleteMapping("templates/{templateId}")
    @ApiOperation("删除模板")
    public @ResponseBody String deleteTemplate(@ApiParam("要删除的ID") @PathVariable String templateId){
        templateService.deleteTemplate(templateId);
        return "deleted";
    }


    @PutMapping ("templates/{templateId}")
    @ApiOperation("更新模板")
    public @ResponseBody String updateTemplate(@ApiParam("要更新的实体类") @RequestBody TemplateDTO templateDTO){
        templateService.updateTemplate(templateDTO);
        return "updated";
    }




}
