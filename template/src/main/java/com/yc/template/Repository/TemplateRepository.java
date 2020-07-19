package com.yc.template.Repository;

import com.yc.template.Entity.TemplateDO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;

public interface TemplateRepository extends JpaRepository<TemplateDO,Long>, JpaSpecificationExecutor<TemplateDO> {
    List<TemplateDO> findById(String id);
}
