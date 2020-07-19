package com.yc.template.Controller;

import com.yc.template.Entity.Template;
import com.yc.template.Service.DTO.TemplateDTO;
import com.yc.template.Service.TemplateService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
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

    @GetMapping("/findAll")
    @ApiOperation("查询全部模板")
    public @ResponseBody
    List<TemplateDTO> findAll() {
        return templateService.findAll();
    }

    @GetMapping("/findById/{id}")
    @ApiOperation("根据id查询")
    public @ResponseBody List<TemplateDTO> findById(@ApiParam("传入要查询的id参数") @PathVariable String id){
        return templateService.findById(id);
    }

}


