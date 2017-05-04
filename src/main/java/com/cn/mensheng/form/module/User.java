package com.cn.mensheng.form.module;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {
    private Integer user_id;

    private String user_name;

    private String password;

    private Byte user_type;

    private Byte locked;

    private Integer credit;

    private Date last_visit;

    private String last_ip;

    private static final long serialVersionUID = 1L;

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name == null ? null : user_name.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Byte getUser_type() {
        return user_type;
    }

    public void setUser_type(Byte user_type) {
        this.user_type = user_type;
    }

    public Byte getLocked() {
        return locked;
    }

    public void setLocked(Byte locked) {
        this.locked = locked;
    }

    public Integer getCredit() {
        return credit;
    }

    public void setCredit(Integer credit) {
        this.credit = credit;
    }

    public Date getLast_visit() {
        return last_visit;
    }

    public void setLast_visit(Date last_visit) {
        this.last_visit = last_visit;
    }

    public String getLast_ip() {
        return last_ip;
    }

    public void setLast_ip(String last_ip) {
        this.last_ip = last_ip == null ? null : last_ip.trim();
    }
}