package com.yc.template;

import com.yc.template.Entity.FieldDO;
import com.yc.template.Repository.AreaRepository;
import com.yc.template.Repository.FieldRepository;
import com.yc.template.Repository.TemplateRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class UpdateTest {
    @Autowired
    private TemplateRepository templateRepository;
    @Autowired
    private AreaRepository areaRepository;
    @Autowired
    private FieldRepository fieldRepository;

    @Test
    public void update(){
        FieldDO fieldDO = fieldRepository.getOne("402880e67364f10c017364f115420010");
        fieldDO.setFieldName("荣誉时间");
        fieldRepository.save(fieldDO);
    }
}
