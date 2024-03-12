package com.integracoes.adq_jde.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.integracoes.adq_jde.entity.EntityS5;
import com.integracoes.adq_jde.repository.S5Repository;

@Service
public class GetS5 {
    @Autowired
    private S5Repository s5Repository;
    
    public List<EntityS5> findByRpdgj(Long rpdgj){
        
        return s5Repository.findByRpdgj(rpdgj);
    }

    public Double sumS5(Long rpdgj){        
        return s5Repository.sumS5(rpdgj);
    }

}
