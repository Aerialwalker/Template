package com.yc.model.Repository;

import com.yc.model.Entity.Model;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface ModelRepository extends CrudRepository<Model,Long> {
    Model findAllByModel_id();

}
