package com.my.shiro.tools;

import org.apache.shiro.crypto.SecureRandomNumberGenerator;
import org.apache.shiro.crypto.hash.SimpleHash;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description 生成摘要（digest）
 * @author Gzy
 * @version 1.0
 */
public class DigestsUtil {
        //加密方式-散列算法1
        public static final String SHA1 = "SHA-1";
        //加密次数
        public static final Integer HashIterations = 33;

        /**
         * @Description 摘要算法
         * @param input 需要加密的内容
         * @param salt  盐值-干扰数据
         * @return 加密之后的字符串
         */
        public static String sha1(String input,String salt){
            return new SimpleHash(SHA1,input,salt,HashIterations).toString();
        }

        /**
         * @Description 随机生成salt
         * @return hex编码的salt
         */
        public static String generateSalt(){
            SecureRandomNumberGenerator secureRandomNumberGenerator = new SecureRandomNumberGenerator();
            return secureRandomNumberGenerator.nextBytes().toHex();
        }

    /**
     * @Description 生成(hash计算之后)密码 和 salt明文
     * @param password
     * @return salt, password
     */
    public static Map<String,String>  entryptPassword(String password){
            Map<String,String> map = new HashMap<>();
            String salt = generateSalt();
            String afterHashPassword = sha1(password, salt);
            map.put("password",afterHashPassword);
            map.put("salt",salt);
            return map;
        }

}
