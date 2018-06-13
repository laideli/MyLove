package com.wangfang.springcloud.controller;

import com.wangfang.springcloud.entities.Dept;
import com.wangfang.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DeptController {

    @Autowired
    private DeptService service;

    @RequestMapping(value="/dept/add",method= RequestMethod.POST)
    public boolean add(@RequestBody Dept dept){
        return  service.add(dept);
    }

    @RequestMapping(value="/dept/get/{id}",method= RequestMethod.GET)
    public Dept get(@PathVariable("id") Long id){
        return  service.get(id);
    }

    @RequestMapping(value="/dept/list",method= RequestMethod.GET)
    public List<Dept> list(){
        return  service.list();
    }
}
