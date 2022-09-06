package com.my.shiro.service.impl;



import com.my.shiro.service.SecurityService;
import com.my.shiro.tools.DigestsUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author Gzy
 * @version 1.0
 */
public class SecurityServiceImpl implements SecurityService {

    public Map<String,String> getPasswordByUserName(String userName){
        //模拟密码
        String password = "123";
        Map<String, String> map = DigestsUtil.entryptPassword(password);
        return map;
    }

    /**
     * 获取角色列表(通过用户名称)
     * @param userName
     * @return
     */
    public List<String> findRoleByLoginName(String userName){
        List<String> list = new ArrayList<>();
        if("admin".equals(userName)){
            list.add("admin");
        }else{
            list.add("dev");
        }

        return list;
    }

    /**
     * 获取权限列表(通过用户名称)
     * @param userName
     * @return
     */
    public List<String> findPermissionByLoginName(String userName){
        List<String> list = new ArrayList<>();
        if("jxr".equals(userName)){
            list.add("order:add");
            list.add("order:list");
            list.add("order:del");
        }
        return list;
    }


}
