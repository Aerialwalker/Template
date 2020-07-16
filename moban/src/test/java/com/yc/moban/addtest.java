package com.yc.moban;

import com.yc.moban.Entity.Moban;
import com.yc.moban.Entity.Quyu;
import com.yc.moban.Repository.MobanRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class addtest {
    @Autowired
    private MobanRepository mobanRepository;

    @Test
    public void add(){
        Moban moban = new Moban();
        moban.setMoban_name("resume");
        mobanRepository.save(moban);

    }






}
