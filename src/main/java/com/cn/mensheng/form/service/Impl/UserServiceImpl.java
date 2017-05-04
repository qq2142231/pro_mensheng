package com.cn.mensheng.form.service.Impl;

import com.cn.mensheng.form.constant.formconstant;
import com.cn.mensheng.form.module.LoginLog;
import com.cn.mensheng.form.module.User;
import com.cn.mensheng.form.service.UserService;
import com.cn.mensheng.mapper.LoginLogMapper;
import com.cn.mensheng.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * Created by l on 2017/4/29.
 */
@Service("userService")
public class UserServiceImpl implements UserService{

    @Autowired
    private UserMapper userMapper;
    @Autowired
    private LoginLogMapper loginLogMapper;

    /**
     * 注册一个新用户,如果用户名已经存在此抛出UserExistException的异常
     * @param user
     */
    public void register(User user) {
        User u = this.getUserByUserName(user.getUser_name());
        if(u != null){
            return ;
        }else{
            user.setCredit(100);
            user.setUser_type(formconstant.NORMAL_USER);
            userMapper.insert(user);
        }
    }

    /**
     * 更新用户
     * @param user
     */
    public void update(User user){
        userMapper.updateByPrimaryKey(user);
    }


    /**
     * 根据用户名/密码查询 User对象
     * @param userName 用户名
     * @return User
     */
    public User getUserByUserName(String userName){
        return userMapper.selectByUserName(userName);
    }


    /**
     * 根据userId加载User对象
     * @param userId
     * @return
     */
    public User getUserById(int userId){
        return userMapper.selectByPrimaryKey(userId);
    }

    /**
     * 将用户锁定，锁定的用户不能够登录
     * @param userName 锁定目标用户的用户名
     */
    public void lockUser(String userName){
        User user = userMapper.selectByUserName(userName);
        user.setLocked(formconstant.USER_LOCK);
        userMapper.updateByPrimaryKey(user);
    }

    /**
     * 解除用户的锁定
     * @param userName 解除锁定目标用户的用户名
     */
    public void unlockUser(String userName){
        User user = userMapper.selectByUserName(userName);
        user.setLocked(formconstant.USER_UNLOCK);
        userMapper.updateByPrimaryKey(user);
    }


    /**
     * 根据用户名为条件，执行查询操作
     * @param userName 查询用户名
     * @return 所有用户名前导匹配的userName的用户
     */
    public User queryUserByUserName(String userName){
        return userMapper.selectByUserName(userName);
    }

    /**
     * 获取所有用户
     * @return 所有用户
     */
    public List<User> getAllUsers(){
        return userMapper.loadAll();
    }

    /**
     * 登陆成功
     * @param user
     */
    public void loginSuccess(User user) {
        user.setCredit( 5 + user.getCredit());
        LoginLog loginLog = new LoginLog();
        loginLog.setUser_id(user.getUser_id());
        loginLog.setIp(user.getLast_ip());
        loginLog.setLogin_datetime(new Date());
        userMapper.updateByPrimaryKey(user);
        loginLogMapper.insert(loginLog);
    }

}
