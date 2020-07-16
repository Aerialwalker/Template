package com.yc.model;

import com.yc.model.Entity.Model;
import com.yc.model.Repository.ModelRepository;
import com.yc.model.Repository.AreaRepository;
import com.yc.model.Repository.ZiduanRepository;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.transaction.Transactional;

@SpringBootTest
class ModelApplicationTests {
    private ModelRepository modelRepository;
    private AreaRepository areaRepository;
    private ZiduanRepository ziduanRepository;

    @Test
    @Transactional
    public void addModel() {
        Model model = new Model();
        model.setModel_name("resume");
        model.setCreater_name("yc");
        model.setChanger_name("tyq");
        modelRepository.save(model);




    }

}
