package com.wangfang.springcloud.service.impl;

import com.wangfang.springcloud.dao.DeptDao;
import com.wangfang.springcloud.entities.Dept;
import com.wangfang.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DeptServiceImpl implements DeptService{

    @Resource
    private DeptDao DeptDao;

    @Override
    public boolean add(Dept dept) {
        return DeptDao.addDept(dept);
    }

    @Override
    public Dept get(Long id) {
        return DeptDao.findById(id);
    }

    @Override
    public List<Dept> list() {
        return DeptDao.findAll();
    }
}
