package com.dpeng.springframework.beans.factory.config;

/**
 * 单例 Bean 注册表
 */
public interface SingletonBeanRegistry {

    Object getSingleton(String beanName);
}