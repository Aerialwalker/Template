package com.yc.template.Repository;

import com.yc.template.Entity.TemplateDO;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import java.util.Set;

public interface TemplateRepository extends JpaRepository<TemplateDO,Long>, JpaSpecificationExecutor<TemplateDO> {

    @EntityGraph(value = "template.all",type = EntityGraph.EntityGraphType.FETCH)
    Set<TemplateDO> findById(String id);
    void deleteById(String id);

}
