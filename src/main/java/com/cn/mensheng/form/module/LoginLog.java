package com.cn.mensheng.form.module;

import java.io.Serializable;
import java.util.Date;

public class LoginLog implements Serializable {
    private Integer login_log_id;

    private Integer user_id;

    private String ip;

    private Date login_datetime;

    private static final long serialVersionUID = 1L;

    public Integer getLogin_log_id() {
        return login_log_id;
    }

    public void setLogin_log_id(Integer login_log_id) {
        this.login_log_id = login_log_id;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    public Date getLogin_datetime() {
        return login_datetime;
    }

    public void setLogin_datetime(Date login_datetime) {
        this.login_datetime = login_datetime;
    }
}