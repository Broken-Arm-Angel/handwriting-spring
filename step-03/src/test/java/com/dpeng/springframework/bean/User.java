package com.dpeng.springframework.bean;

/**
 * 2023/05/07
 */
public class User {

    private String name;

    public User() {
    }

    public User(String name) {
        this.name = name;
    }

    public String getUserName() {
        return name;
    }
}