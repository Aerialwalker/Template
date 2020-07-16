package com.yc.template.Repository;

import com.yc.template.Entity.Field;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;

public interface FieldRepository extends JpaRepository<Field,Long>, JpaSpecificationExecutor<Field> {
    
}
