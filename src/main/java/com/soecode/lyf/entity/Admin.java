package com.soecode.lyf.entity;

public class Admin {
    private Integer admin_id;
    private String admin_account;
    private String admin_passwd;
    private String admin_name;
    private String admin_email;
    private String admin_tel;

    public Admin() {
    }

    public Integer getAdmin_id() {
        return admin_id;
    }

    public void setAdmin_id(Integer admin_id) {
        this.admin_id = admin_id;
    }

    public String getAdmin_account() {
        return admin_account;
    }

    public void setAdmin_account(String admin_account) {
        this.admin_account = admin_account;
    }

    public String getAdmin_passwd() {
        return admin_passwd;
    }

    public void setAdmin_passwd(String admin_passwd) {
        this.admin_passwd = admin_passwd == null ? null : admin_passwd.trim();
    }

    public String getAdmin_name() {
        return admin_name;
    }

    public void setAdmin_name(String admin_name) {
        this.admin_name = admin_name;
    }

    public String getAdmin_email() {
        return admin_email;
    }

    public void setAdmin_email(String admin_email) {
        this.admin_email = admin_email == null ? null : admin_email.trim();
    }

    public String getAdmin_tel() {
        return admin_tel;
    }

    public void setAdmin_tel(String admin_tel) {
        this.admin_tel = admin_tel == null ? null : admin_tel.trim();
    }

    @Override
    public String toString() {
        return "Admin{" +
                "admin_id=" + admin_id +
                ", admin_account='" + admin_account + '\'' +
                ", admin_passwd='" + admin_passwd + '\'' +
                ", admin_name='" + admin_name + '\'' +
                ", admin_email='" + admin_email + '\'' +
                ", admin_tel='" + admin_tel + '\'' +
                '}';
    }
}
