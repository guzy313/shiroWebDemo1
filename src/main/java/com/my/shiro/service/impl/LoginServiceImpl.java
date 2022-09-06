package com.my.shiro.service.impl;

import com.my.shiro.service.LoginService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;

/**
 * @Description 登录服务实现
 * @author Gzy
 * @version 1.0
 */
public class LoginServiceImpl implements LoginService {


    @Override
    public boolean login(UsernamePasswordToken token) {
        //通过安全管理器获取主体
        Subject subject = SecurityUtils.getSubject();
        try {
            subject.login(token);
        }catch (Exception e){
            return false;
        }
        return subject.isAuthenticated();
    }

    @Override
    public void logout() {
        Subject subject = SecurityUtils.getSubject();
        subject.logout();
    }
}
