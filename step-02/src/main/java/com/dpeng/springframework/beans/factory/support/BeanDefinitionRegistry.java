package com.dpeng.springframework.beans.factory.support;


import com.dpeng.springframework.beans.factory.config.BeanDefinition;

/**
 * Bean 定义信息注册接口
 */
public interface BeanDefinitionRegistry {

    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);
}