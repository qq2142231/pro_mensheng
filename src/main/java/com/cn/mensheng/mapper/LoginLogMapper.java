package com.cn.mensheng.mapper;

import com.cn.mensheng.form.module.LoginLog;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;


public interface LoginLogMapper {
    int deleteByPrimaryKey(Integer login_log_id);

    int insert(LoginLog record);

    int insertSelective(LoginLog record);

    LoginLog selectByPrimaryKey(Integer login_log_id);

    int updateByPrimaryKeySelective(LoginLog record);

    int updateByPrimaryKey(LoginLog record);
}