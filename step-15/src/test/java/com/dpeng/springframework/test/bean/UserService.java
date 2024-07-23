package com.dpeng.springframework.test.bean;

import com.dpeng.springframework.beans.factory.annotation.Value;
import com.dpeng.springframework.stereotype.Component;

import java.util.Random;


public class UserService implements IUserService {

    @Value("${token}")
    private String token;

    public String queryUserInfo() {
        try {
            Thread.sleep(new Random(1).nextInt(100));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "dpeng，10086，杭州，" + token;
    }

    public String register(String userName) {
        try {
            Thread.sleep(new Random(1).nextInt(100));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "注册用户：" + userName + " success！";
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}