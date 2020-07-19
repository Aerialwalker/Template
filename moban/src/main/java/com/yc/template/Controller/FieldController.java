package com.yc.template.Controller;

import com.yc.template.Entity.Field;
import com.yc.template.Service.DTO.FieldDTO;
import com.yc.template.Service.FieldService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class FieldController {
    @Resource
    public FieldService fieldService;

    @GetMapping("/findx")
    @ApiOperation("模糊查询字段")
    public @ResponseBody List<FieldDTO> findx(@ApiParam("传入要查询的字段参数") @RequestParam String find){
        return fieldService.Findx(find);
    }


}
