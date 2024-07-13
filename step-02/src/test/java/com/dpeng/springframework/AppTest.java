package com.dpeng.springframework;


import com.dpeng.springframework.bean.User;
import com.dpeng.springframework.beans.factory.support.DefaultListableBeanFactory;
import com.dpeng.springframework.beans.factory.config.BeanDefinition;
import junit.framework.TestCase;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase {

    public void testBeanFactory() {
        DefaultListableBeanFactory defaultListableBeanFactory = new DefaultListableBeanFactory();
        BeanDefinition beanDefinition = new BeanDefinition(User.class);
        defaultListableBeanFactory.registerBeanDefinition("user", beanDefinition);
        User user1 = (User) defaultListableBeanFactory.getBean("user");
        user1.getUserName();
        // 第二次从单例缓存中获取 Bean 对象
        User user2 = (User) defaultListableBeanFactory.getBean("user");
        user2.getUserName();
        System.out.println(user1 == user2);
    }
}