package com.yc.template.Controller;

import com.yc.template.Entity.Field;
import com.yc.template.Service.FieldService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class FieldController {
    @Resource
    public FieldService fieldService;

    @RequestMapping("/findx")
    public @ResponseBody List<Field> findx(@RequestParam String find){
        return fieldService.Findx(find);
    }


}
