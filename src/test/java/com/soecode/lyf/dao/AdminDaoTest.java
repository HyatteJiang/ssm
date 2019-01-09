package com.soecode.lyf.dao;

import com.soecode.lyf.BaseTest;
import com.soecode.lyf.entity.Admin;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class AdminDaoTest extends BaseTest {

    @Autowired
    private AdminDao adminDao;

    @Test
    public void queryTest(){
        Admin admin = new Admin();
        admin.setAdmin_account("admin");
        admin.setAdmin_passwd("admin");
        List<Admin> adminList = adminDao.queryAdmin(admin);
        for (Admin admin1 : adminList){
            System.out.println(admin1);
        }
    }

}
