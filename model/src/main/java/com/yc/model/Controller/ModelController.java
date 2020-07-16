package com.yc.model.Controller;


import com.yc.model.Entity.Model;
import com.yc.model.Repository.ModelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class ModelController {
    @Autowired
    private ModelRepository modelRepository;

    @GetMapping("/FindAll")
    public @ResponseBody Iterable<Model> findALL(){
        return modelRepository.findAll();
    }


}
