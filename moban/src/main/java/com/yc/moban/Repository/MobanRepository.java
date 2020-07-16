package com.yc.moban.Repository;

import com.yc.moban.Entity.Moban;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface MobanRepository extends JpaRepository<Moban,Long> {
}
