package com.my.shiro.service;



import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author Gzy
 * @version 1.0
 */
public interface SecurityService {

    public Map<String,String> getPasswordByUserName(String userName);


    /**
     * 获取角色列表(通过用户名称)
     * @param userName
     * @return
     */
    public List<String> findRoleByLoginName(String userName);

    /**
     * 获取权限列表(通过用户名称)
     * @param userName
     * @return
     */
    public List<String> findPermissionByLoginName(String userName);

}
