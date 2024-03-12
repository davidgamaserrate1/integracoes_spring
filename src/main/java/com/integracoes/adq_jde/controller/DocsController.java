package com.integracoes.adq_jde.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.integracoes.adq_jde.entity.EntityS5;
import com.integracoes.adq_jde.service.GetS5;

@RestController
@RequestMapping("consulta")
public class DocsController {
    
    @Autowired
    private GetS5 getS5;

    @GetMapping("{rpdgj}")
    public List<EntityS5> getS5(@PathVariable("rpdgj") Long rpdgj){
        List<EntityS5> entityS5 = getS5.findByRpdgj(rpdgj);

        return entityS5;
    }

    @GetMapping("/soma/{rpdgj}")
    public Double sumS5(@PathVariable("rpdgj") Long rpdgj){
        return getS5.sumS5(rpdgj);

         
    }
}
