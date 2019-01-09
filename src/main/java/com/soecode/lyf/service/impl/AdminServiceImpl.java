package com.soecode.lyf.service.impl;

import com.soecode.lyf.dao.AdminDao;
import com.soecode.lyf.entity.Admin;
import com.soecode.lyf.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;


@Service("adminService")
public class AdminServiceImpl implements AdminService {

    @Autowired
    @Qualifier("adminDao")
    private AdminDao mapper;

    @Override
    public boolean insertAdmin(Admin admin) {
        return mapper.insertAdmin(admin);
    }

    @Override
    public boolean updateAdmin(Admin admin) {
        return mapper.updateAdmin(admin);
    }

    @Override
    public List<Admin> queryAdmin(Admin admin) {
        return mapper.queryAdmin(admin);
    }
}
