package com.dpeng.springframework.context.support;

import com.dpeng.springframework.beans.factory.config.BeanPostProcessor;
import com.dpeng.springframework.context.ApplicationContext;
import com.dpeng.springframework.context.ApplicationContextAware;
import com.dpeng.springframework.beans.BeansException;


public class ApplicationContextAwareProcessor implements BeanPostProcessor {

    private final ApplicationContext applicationContext;

    public ApplicationContextAwareProcessor(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof ApplicationContextAware) {
            ((ApplicationContextAware) bean).setApplicationContext(applicationContext);
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }
}