package com.yc.template.Repository;

import com.yc.template.Entity.AreaDO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface AreaRepository extends JpaRepository<AreaDO,Long>, JpaSpecificationExecutor<AreaDO> {


}
