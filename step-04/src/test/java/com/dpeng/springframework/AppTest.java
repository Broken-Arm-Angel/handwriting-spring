package com.dpeng.springframework;


import com.dpeng.springframework.bean.User;
import com.dpeng.springframework.bean.UserService;
import com.dpeng.springframework.beans.factory.PropertyValue;
import com.dpeng.springframework.beans.factory.PropertyValues;
import com.dpeng.springframework.beans.factory.config.BeanDefinition;
import com.dpeng.springframework.beans.factory.config.BeanReference;
import com.dpeng.springframework.beans.factory.support.DefaultListableBeanFactory;
import junit.framework.TestCase;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase {

    public void testBeanFactory() {
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

        beanFactory.registerBeanDefinition("user", new BeanDefinition(User.class));

        PropertyValues propertyValues = new PropertyValues();
        propertyValues.addPropertyValue(new PropertyValue("userId", "1111"));
        propertyValues.addPropertyValue(new PropertyValue("user", new BeanReference("user")));

        BeanDefinition beanDefinition = new BeanDefinition(UserService.class, propertyValues);
        beanFactory.registerBeanDefinition("userService", beanDefinition);

        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.getUserInfo();
    }
}