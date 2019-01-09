package com.soecode.lyf.service;

import com.soecode.lyf.entity.Admin;

import java.util.List;

public interface AdminService {

    boolean insertAdmin(Admin admin);

    boolean updateAdmin(Admin admin);

    List<Admin> queryAdmin(Admin admin);

}
