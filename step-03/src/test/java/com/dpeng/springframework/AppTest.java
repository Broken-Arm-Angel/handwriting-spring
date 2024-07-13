package com.dpeng.springframework;

import com.dpeng.springframework.bean.User;
import com.dpeng.springframework.beans.factory.support.DefaultListableBeanFactory;
import com.dpeng.springframework.beans.factory.support.config.BeanDefinition;
import junit.framework.TestCase;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase {

    public void testBeanFactory() {
        DefaultListableBeanFactory defaultListableBeanFactory = new DefaultListableBeanFactory();
        BeanDefinition beanDefinition = new BeanDefinition(User.class);
        defaultListableBeanFactory.registerBeanDefinition("user", beanDefinition);
        User user = (User) defaultListableBeanFactory.getBean("user", "dpeng");
        System.out.println(user.getUserName());
    }
}