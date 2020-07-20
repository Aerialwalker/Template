package com.yc.template.Repository;

import com.yc.template.Entity.AreaDO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;

public interface AreaRepository extends JpaRepository<AreaDO,Long>, JpaSpecificationExecutor<AreaDO> {
    List<AreaDO> findById(String id);

}
