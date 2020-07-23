package com.yc.template.Service.Mapper;

import com.yc.template.Entity.AreaDO;
import com.yc.template.Entity.TemplateDO;
import com.yc.template.Repository.TemplateRepository;
import com.yc.template.Service.DTO.AreaDTO;
import com.yc.template.Service.DTO.TemplateDTO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class TemplateMapper {
    @Autowired
    private AreaMapper areaMapper;
    @Autowired
    private TemplateRepository templateRepository;

    public TemplateDTO converterDtoSimple(TemplateDO templateDO){
        TemplateDTO templateDTO = new TemplateDTO();
        templateDTO.setTemplateName(templateDO.getTemplateName());
        templateDTO.setDescription(templateDO.getDescription());
        templateDTO.setAreaCount(templateDO.getAreaCount());
        return templateDTO;
    }
    public TemplateDTO converterDtoDetail(TemplateDO templateDO){
        TemplateDTO templateDTO = new TemplateDTO();
        templateDTO.setId(templateDO.getId());
        templateDTO.setTemplateName(templateDO.getTemplateName());
        templateDTO.setDescription(templateDO.getDescription());

        List<AreaDTO> list=new ArrayList();
        List<AreaDO> areaList = templateDO.getAreaList();
        for(AreaDO areaDO:areaList){
            list.add(areaMapper.converterDTO(areaDO)) ;
        }
        templateDTO.setAreaList(list);


        templateDTO.setAreaCount(templateDO.getAreaCount());
        return templateDTO;
    }

    public TemplateDO converterDO(TemplateDTO templateDTO){
        TemplateDO templateDO = new TemplateDO();
        templateDO.setTemplateName(templateDTO.getTemplateName());
        templateDO.setDescription(templateDTO.getDescription());
        templateDO.setAreaCount(templateDTO.getAreaCount());

        List<AreaDO> list=new ArrayList();
        List<AreaDTO> areaList = templateDTO.getAreaList();
        System.out.println(templateDTO.getTemplateName());
        if(areaList!=null){
        for(AreaDTO areaDTO:areaList){
            list.add(areaMapper.converterDO(areaDTO,templateDO)) ;
        }}
        templateDO.setAreaList(list);
        return templateDO;
    }

    public TemplateDO updateTemplate(TemplateDTO templateDTO){
        TemplateDO templateDO = templateRepository.findById(templateDTO.getId());
        templateDO.setTemplateName(templateDTO.getTemplateName());
        templateDO.setDescription(templateDTO.getDescription());

        List<AreaDO> listDO = templateDO.getAreaList();
        List<AreaDTO> listDTO = templateDTO.getAreaList();

        areaMapper.updateArea(listDO,listDTO,templateDO);
        return templateDO;
    }



}
