package com.yc.template.Repository;

import com.yc.template.Entity.FieldDO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface FieldRepository extends JpaRepository<FieldDO,String>, JpaSpecificationExecutor<FieldDO> {

}
