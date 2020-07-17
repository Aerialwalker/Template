package com.yc.template.Repository;

import com.yc.template.Entity.Template;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TemplateRepository extends JpaRepository<Template,Long> {
    List<Template> findById(String id);
}
