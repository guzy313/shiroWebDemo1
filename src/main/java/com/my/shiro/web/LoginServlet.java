package com.my.shiro.web;

import com.my.shiro.service.impl.LoginServiceImpl;
import org.apache.shiro.authc.UsernamePasswordToken;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Gzy
 * @version 1.0
 */
@WebServlet(urlPatterns = "/login")
public class LoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取用户名密码（用户登录提交）
        String userName = req.getParameter("userName");
        String password = req.getParameter("password");
        //构建登录token对象
        UsernamePasswordToken token = new UsernamePasswordToken();
        token.setUsername(userName);
        token.setPassword(password.toCharArray());

        //使用token登录
        LoginServiceImpl loginService = new LoginServiceImpl();
        boolean isLogin = loginService.login(token);
        if(isLogin){
            //登录成功
            req.getRequestDispatcher("/home").forward(req,resp);
        }else{
            //登录失败
            resp.sendRedirect("/login.jsp");
        }

    }
}
