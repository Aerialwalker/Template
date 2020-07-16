package com.yc.model.Repository;

import com.yc.model.Entity.Area;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface AreaRepository extends CrudRepository<Area,Long> {
    Area findAllByArea_id();
}
