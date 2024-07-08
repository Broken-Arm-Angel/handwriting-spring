package com.depng.springframework;

import com.depng.springframework.bean.Student;
import com.dpeng.springframework.BeanDefinition;
import com.dpeng.springframework.BeanFactory;
import org.junit.Test;

/**
 * 测试类
 */
public class GetBeanTest {

    @Test
    public void getBeanTest() {
        BeanDefinition beanDefinition = new BeanDefinition(new Student("dpeng", 20));
        BeanFactory beanFactory = new BeanFactory();
        beanFactory.registerBeanDefinition("studentBean", beanDefinition);
        Object studentBean = beanFactory.getBean("studentBean");
        System.out.println(studentBean);
    }
}
