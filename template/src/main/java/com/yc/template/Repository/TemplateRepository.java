package com.yc.template.Repository;

import com.yc.template.Entity.TemplateDO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Map;

public interface TemplateRepository extends JpaRepository<TemplateDO,Long>, JpaSpecificationExecutor<TemplateDO> {
    List<TemplateDO> findById(String id);

    @Query("select count(id) AS countId ,templateDO.id AS templateId from AreaDO group by templateDO.id")
    List<Map> findCount();


}
