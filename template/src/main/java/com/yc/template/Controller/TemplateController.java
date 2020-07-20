package com.yc.template.Controller;

import com.yc.template.Service.DTO.TemplateDTO;
import com.yc.template.Service.TemplateService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/api")
public class TemplateController {
    @Resource
    public TemplateService templateService;

    @GetMapping("/template")
    @ApiOperation("查询所有模板")
    public @ResponseBody List<TemplateDTO> findAll(){
        return templateService.findAll();
    }

    @GetMapping("template/id/{id}")
    @ApiOperation("根据ID查询")
    public @ResponseBody List<TemplateDTO> findById(@ApiParam("要查询的ID") @PathVariable String id){
        return templateService.findById(id);
    }

    @GetMapping("/template/{name}")
    @ApiOperation("模糊查询")
    public @ResponseBody List<TemplateDTO> findAll(@ApiParam("要查询的字段") @PathVariable String name){
        return templateService.findAll(name);
    }

    @PostMapping("/test")
    @ApiOperation("实体类测试")
    public TemplateDTO test(@RequestBody TemplateDTO templateDTO){
        return templateDTO;
    }

}
