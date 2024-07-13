package com.dpeng.springframework.beans.factory.support.config;

/**
 * 单例注册表
 */
public interface SingletonBeanRegistry {

    Object getSingleton(String beanName);
}