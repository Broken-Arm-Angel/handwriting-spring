package com.dpeng.springframework.test.bean;

import com.dpeng.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class UserDao {

    private static Map<String, String> hashMap = new HashMap<>();

    static {
        hashMap.put("20020104", "dpeng1，浙江，杭州");
    }

    public String queryUserName(String uId) {
        return hashMap.get(uId);
    }
}