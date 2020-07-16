package com.yc.template;

import com.yc.template.Entity.Template;
import com.yc.template.Repository.TemplateRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

@SpringBootTest
public class addtest {
    @Autowired
    private TemplateRepository templateRepository;
    @Test
    public void add(){
    Template template= new Template();
    template.setTemplateName("flight");
    template.setCreateName("ycc");
    template.setChangeName("ttyq");
    templateRepository.save(template);


}









}
