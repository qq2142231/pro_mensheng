package com.cn.mensheng.mapper;

import com.cn.mensheng.form.module.User;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface UserMapper {
    int deleteByPrimaryKey(Integer user_id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer user_id);

    User selectByUserName(String user_name);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    List<User> loadAll();
}