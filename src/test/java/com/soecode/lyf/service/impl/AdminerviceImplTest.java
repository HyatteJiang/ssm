package com.soecode.lyf.service.impl;

import com.soecode.lyf.BaseTest;
import com.soecode.lyf.entity.Admin;
import com.soecode.lyf.service.AdminService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class AdminerviceImplTest extends BaseTest {

    @Autowired
    private AdminService adminService;

    @Test
    public void queryTest(){
        Admin admin = new Admin();
        admin.setAdmin_account("admin");
        admin.setAdmin_passwd("admin");
        List<Admin> adminList = adminService.queryAdmin(admin);
        for (Admin admin1: adminList) {
            System.out.println(admin1);
        }
    }
}
