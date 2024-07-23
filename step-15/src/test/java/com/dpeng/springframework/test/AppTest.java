package com.dpeng.springframework.test;

import com.dpeng.springframework.test.bean.IUserService;
import com.dpeng.springframework.context.support.ClassPathXmlApplicationContext;
import junit.framework.TestCase;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase {

    @Test
    public void testAutoProxy() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring.xml");
        IUserService userService = applicationContext.getBean("userService", IUserService.class);
        System.out.println("测试结果：" + userService.queryUserInfo());
    }
}