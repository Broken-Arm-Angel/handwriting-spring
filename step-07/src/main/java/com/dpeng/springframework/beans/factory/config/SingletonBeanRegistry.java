package com.dpeng.springframework.beans.factory.config;


public interface SingletonBeanRegistry {

    Object getSingleton(String beanName);

    void destroySingletons();
}