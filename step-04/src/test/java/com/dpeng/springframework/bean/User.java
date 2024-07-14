package com.dpeng.springframework.bean;

import java.util.HashMap;
import java.util.Map;

public class User {

    private static Map<String, String> map = new HashMap<>();

    static {
        map.put("1111", "wpeng1");
        map.put("2222", "wpeng2");
    }

    public String getUsername(String userId) {
        return map.get(userId);
    }
}