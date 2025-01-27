package com.dpeng.springframework.test.bean;

import java.util.HashMap;
import java.util.Map;


public class UserDao {

    private static Map<String, String> hashMap = new HashMap<>();

    public void initDataMethod() {
        System.out.println("执行：init-method");
        hashMap.put("12345", "dpeng1");
        hashMap.put("12346", "depng2");
    }

    public void destroyDataMethod() {
        System.out.println("执行：destroy-method");
        hashMap.clear();
    }

    public String queryUserName(String uId) {
        return hashMap.get(uId);
    }
}