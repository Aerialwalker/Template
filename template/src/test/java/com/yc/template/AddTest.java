package com.yc.template;

import com.yc.template.Entity.AreaDO;
import com.yc.template.Entity.FieldDO;
import com.yc.template.Entity.TemplateDO;
import com.yc.template.Repository.AreaRepository;
import com.yc.template.Repository.FieldRepository;
import com.yc.template.Repository.TemplateRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class AddTest {
    @Autowired
    private TemplateRepository templateRepository;
    @Autowired
    private AreaRepository areaRepository;
    @Autowired
    private FieldRepository fieldRepository;

    @Test
    public void add(){
        TemplateDO template= new TemplateDO();
        template.setTemplateName("行程模板");
        template.setDiscription("这是一个行程模板");
        templateRepository.save(template);

        TemplateDO template2= new TemplateDO();
        template2.setTemplateName("简历模板");
        template2.setDiscription("这是一个简历模板");
        templateRepository.save(template2);

        AreaDO area = new AreaDO();
        area.setTemplateDO(template2);
        area.setAreaName("基本信息");
        area.setOrderId(1);
        areaRepository.save(area);

        AreaDO area2 = new AreaDO();
        area2.setTemplateDO(template2);
        area2.setAreaName("学习经历");
        area2.setOrderId(2);
        areaRepository.save(area2);

        AreaDO area3 = new AreaDO();
        area3.setTemplateDO(template2);
        area3.setAreaName("实习经历");
        area3.setOrderId(3);
        areaRepository.save(area3);

        AreaDO area4 = new AreaDO();
        area4.setTemplateDO(template2);
        area4.setAreaName("所获荣誉");
        area4.setOrderId(4);
        areaRepository.save(area4);

        FieldDO field = new FieldDO();
        field.setAreaDO(area);
        field.setFieldName("姓名");
        field.setOrderId(1);
        fieldRepository.save(field);

        FieldDO field2 = new FieldDO();
        field2.setAreaDO(area);
        field2.setFieldName("性别");
        field2.setOrderId(2);
        fieldRepository.save(field2);

        FieldDO field3 = new FieldDO();
        field3.setAreaDO(area);
        field3.setFieldName("邮箱");
        field3.setOrderId(3);
        fieldRepository.save(field3);

        FieldDO field4 = new FieldDO();
        field4.setAreaDO(area2);
        field4.setFieldName("学位");
        field4.setOrderId(4);
        fieldRepository.save(field4);

        FieldDO field5 = new FieldDO();
        field5.setAreaDO(area2);
        field5.setFieldName("毕业院校");
        field5.setOrderId(5);
        fieldRepository.save(field5);

        FieldDO field6 = new FieldDO();
        field6.setAreaDO(area2);
        field6.setFieldName("毕业时间");
        field6.setOrderId(6);
        fieldRepository.save(field6);

        FieldDO field7 = new FieldDO();
        field7.setAreaDO(area3);
        field7.setFieldName("实习地点");
        field7.setOrderId(7);
        fieldRepository.save(field7);

        FieldDO field8 = new FieldDO();
        field8.setAreaDO(area3);
        field8.setFieldName("实习岗位");
        field8.setOrderId(8);
        fieldRepository.save(field8);

        FieldDO field9 = new FieldDO();
        field9.setAreaDO(area3);
        field9.setFieldName("实习时间");
        field9.setOrderId(9);
        fieldRepository.save(field9);

        FieldDO field10 = new FieldDO();
        field10.setAreaDO(area4);
        field10.setFieldName("荣誉名称");
        field10.setOrderId(10);
        fieldRepository.save(field10);

        FieldDO field11 = new FieldDO();
        field11.setAreaDO(area4);
        field11.setFieldName("获得时间");
        field11.setOrderId(11);
        fieldRepository.save(field11);

    }
}
