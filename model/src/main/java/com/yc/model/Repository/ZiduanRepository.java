package com.yc.model.Repository;

import com.yc.model.Entity.Ziduan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface ZiduanRepository extends CrudRepository<Ziduan,Long> {
    Ziduan findAllByZiduan_id();

}
