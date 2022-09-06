package com.my.shiro.service;

import org.apache.shiro.authc.UsernamePasswordToken;

/**
 *  @Description 登录服务
 * @author Gzy
 * @version 1.0
 */
public interface LoginService {

    /**
     * 登入
     * @param token
     * @return 是否登录成功
     */
    boolean login(UsernamePasswordToken token);

    /**
     * 登出
     */
    void logout();

}
