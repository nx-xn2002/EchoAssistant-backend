package com.bupt.echoassistantbackend.content;

/**
 * user content
 *
 * @author Ni Xiang
 */
public interface UserContent {
    /**
     * 用户角色 0 - 管理员, 1 - 学生, 2 - 老师
     */
    public static final int ADMIN = 0;
    public static final int STUDENT = 1;
    public static final int TEACHER = 2;

    /**
     * 用户登录态
     */
    public static final String USER_LOGIN = "USER LOGIN";
}
