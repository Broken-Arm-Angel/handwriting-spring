package com.dpeng.springframework.beans.factory.support;

import com.dpeng.springframework.beans.factory.config.BeanDefinition;
import com.dpeng.springframework.beans.BeansException;


public interface BeanDefinitionRegistry {

    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);

    BeanDefinition getBeanDefinition(String beanName) throws BeansException;

    boolean containsBeanDefinition(String beanName);

    String[] getBeanDefinitionNames();
}