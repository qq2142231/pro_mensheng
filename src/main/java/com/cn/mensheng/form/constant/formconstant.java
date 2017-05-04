package com.cn.mensheng.form.constant;

/**
 * Created by l on 2017/4/29.
 */
public class formconstant {
    /**
     * 精华主题帖子
     */
    public static final int DIGEST_TOPIC = 1;
    /**
     * 普通的主题帖子
     */
    public static final int NOT_DIGEST_TOPIC = 0;
    /**
     *锁定用户对应的状态值
     */
    public static final byte USER_LOCK = 1;
    /**
     * 用户解锁对应的状态值
     */
    public static final byte USER_UNLOCK = 0;
    /**
     * 管理员类型
     */
    public static final byte FORUM_ADMIN = 2;
    /**
     * 普通用户类型
     */
    public static final byte NORMAL_USER = 1;

    /**
     * 用户对象放到Session中的键名称
     */
    public static final String USER_CONTEXT = "USER_CONTEXT";

    /**
     * 将登录前的URL放到Session中的键名称
     */
    public static final String LOGIN_TO_URL = "toUrl";

    /**
     * 每页的记录数
     */
    public static final int PAGE_SIZE = 3;
}
