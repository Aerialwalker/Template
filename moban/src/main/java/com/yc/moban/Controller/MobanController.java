package com.yc.moban.Controller;

import com.yc.moban.Entity.Moban;
import com.yc.moban.Entity.Ziduan;
import com.yc.moban.Repository.MobanRepository;
import com.yc.moban.Repository.QuyuRepository;
import com.yc.moban.Repository.ZiduanRepository;
import com.yc.moban.Service.MobanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;
import java.util.Set;

@Controller
@ResponseBody
public class MobanController {
//    @Autowired
//    private MobanRepository mobanRepository;
//    @Autowired
//    private QuyuRepository quyuRepository;
//    @Autowired
//    private ZiduanRepository ziduanRepository;

    @Resource
    public MobanService mobanService;


    @RequestMapping("/findALL")
    public @ResponseBody List<Moban> findALL(){
        List<Moban> list = mobanService.findALL();
            return list;
        }

//        List<Ziduan> ziduanList = (List<Ziduan>) ziduanRepository.findAll();
//        for(Ziduan ziduan:ziduanList){
//            System.out.println(ziduan);
//        }
    }


