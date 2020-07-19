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
public class TemplateController {
    @Resource
    public TemplateService templateService;

    @GetMapping("/findAll")
    @ApiOperation("查询所有模板")
    public @ResponseBody List<TemplateDTO> findAll(){
        return templateService.findAll();
    }

    @GetMapping("findById/{id}")
    @ApiOperation("根据ID查询")
    public @ResponseBody List<TemplateDTO> findById(@ApiParam("要查询的ID") @PathVariable String id){
        return templateService.findById(id);
    }

    @GetMapping("/findX")
    @ApiOperation("模糊查询")
    public @ResponseBody List<TemplateDTO> findAll(@ApiParam("要查询的字段") @RequestParam String name){
        return templateService.findAll(name);
    }

    @PostMapping("/test")
    @ApiOperation("实体类测试")
    public TemplateDTO test(@RequestBody TemplateDTO templateDTO){
        return templateDTO;
    }

}
