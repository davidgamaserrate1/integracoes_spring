package com.integracoes.adq_jde.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.integracoes.adq_jde.entity.EntityS5;

@Repository
public interface S5Repository extends JpaRepository<EntityS5, Long> { 

    List<EntityS5> findByRpdgj(Long rpdgj);

    @Query(value="SELECT SUM(u.RPAG) / 100  FROM f03b11 u WHERE u.rpdct ='S5' and u.rpdgj = 123272" , nativeQuery = true)
    Double sumS5(@Param("rpdgj") Long rpdgj);

}
