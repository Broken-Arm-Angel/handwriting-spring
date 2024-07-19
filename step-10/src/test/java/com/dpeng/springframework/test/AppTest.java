package com.dpeng.springframework.test;


import com.dpeng.springframework.context.support.ClassPathXmlApplicationContext;
import com.dpeng.springframework.test.event.CustomEvent;
import junit.framework.TestCase;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase {

    public void testEvent() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring.xml");
        applicationContext.publishEvent(new CustomEvent(applicationContext, 1231234324234L, "成功了"));

        applicationContext.registerShutdownHook();
    }
}