package com.soecode.lyf.dao;

import com.soecode.lyf.entity.Admin;

import java.util.List;

public interface AdminDao {
    boolean insertAdmin(Admin admin);

    boolean updateAdmin(Admin admin);

    List<Admin> queryAdmin(Admin admin);
}
