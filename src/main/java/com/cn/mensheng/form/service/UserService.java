package com.cn.mensheng.form.service;

import com.cn.mensheng.form.module.User;

import java.util.List;

/**
 * Created by l on 2017/4/29.
 */
public interface UserService {
    public void register(User user);

    public void update(User user);

    public User getUserByUserName(String userName);

    public User getUserById(int userId);

    public void lockUser(String userName);

    public void unlockUser(String userName);

    public void loginSuccess(User user);

    public User queryUserByUserName(String userName);

    public List<User> getAllUsers();
}
