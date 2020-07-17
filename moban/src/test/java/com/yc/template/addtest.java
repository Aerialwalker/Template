package com.yc.template;

import com.yc.template.Entity.Area;
import com.yc.template.Entity.Field;
import com.yc.template.Entity.Template;
import com.yc.template.Repository.AreaRepository;
import com.yc.template.Repository.FieldRepository;
import com.yc.template.Repository.TemplateRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

@SpringBootTest
public class addtest {
    @Autowired
    private TemplateRepository templateRepository;
    @Autowired
    private AreaRepository areaRepository;
    @Autowired
    private FieldRepository fieldRepository;


    @Test
    public void add(){
    Template template= new Template();
    template.setTemplateName("行程模板");
    template.setDiscription("这是一个行程模板");
    templateRepository.save(template);

    Template template2= new Template();
    template2.setTemplateName("简历模板");
    template2.setDiscription("这是一个简历模板");
    templateRepository.save(template2);

    Area area = new Area();
    area.setTemplate(template2);
    area.setAreaName("基本信息");
    area.setOrderId(1);
    areaRepository.save(area);

    Area area2 = new Area();
    area2.setTemplate(template2);
    area2.setAreaName("学习经历");
    area2.setOrderId(2);
    areaRepository.save(area2);

    Area area3 = new Area();
    area3.setTemplate(template2);
    area3.setAreaName("实习经历");
    area3.setOrderId(3);
    areaRepository.save(area3);

    Area area4 = new Area();
    area4.setTemplate(template2);
    area4.setAreaName("所获荣誉");
    area4.setOrderId(4);
    areaRepository.save(area4);

    Field field = new Field();
    field.setArea(area);
    field.setFieldName("姓名");
    field.setOrderId(1);
    fieldRepository.save(field);

    Field field2 = new Field();
    field2.setArea(area);
    field2.setFieldName("性别");
    field2.setOrderId(2);
    fieldRepository.save(field2);

    Field field3 = new Field();
    field3.setArea(area);
    field3.setFieldName("邮箱");
    field3.setOrderId(3);
    fieldRepository.save(field3);

    Field field4 = new Field();
    field4.setArea(area2);
    field4.setFieldName("学位");
    field4.setOrderId(4);
    fieldRepository.save(field4);

    Field field5 = new Field();
    field5.setArea(area2);
    field5.setFieldName("毕业院校");
    field5.setOrderId(5);
    fieldRepository.save(field5);

    Field field6 = new Field();
    field6.setArea(area2);
    field6.setFieldName("毕业时间");
    field6.setOrderId(6);
    fieldRepository.save(field6);

    Field field7 = new Field();
    field7.setArea(area3);
    field7.setFieldName("实习地点");
    field7.setOrderId(7);
    fieldRepository.save(field7);

    Field field8 = new Field();
    field8.setArea(area3);
    field8.setFieldName("实习岗位");
    field8.setOrderId(8);
    fieldRepository.save(field8);

    Field field9 = new Field();
    field9.setArea(area3);
    field9.setFieldName("实习时间");
    field9.setOrderId(9);
    fieldRepository.save(field9);

    Field field10 = new Field();
    field10.setArea(area4);
    field10.setFieldName("荣誉名称");
    field10.setOrderId(10);
    fieldRepository.save(field10);

    Field field11 = new Field();
    field11.setArea(area4);
    field11.setFieldName("获得时间");
    field11.setOrderId(11);
    fieldRepository.save(field11);

}
}
