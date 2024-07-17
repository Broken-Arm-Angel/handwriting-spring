package com.dpeng.springframework.test.bean;

import java.util.HashMap;
import java.util.Map;

public class UserDao {

    private static Map<String, String> hashMap = new HashMap<>();

    static {
        hashMap.put("12345", "dpeng1");
        hashMap.put("12346", "dpeng2");
    }

    public String queryUserName(String uId) {
        return hashMap.get(uId);
    }
}