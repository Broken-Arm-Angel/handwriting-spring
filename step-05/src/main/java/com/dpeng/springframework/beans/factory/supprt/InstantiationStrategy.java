package com.dpeng.springframework.beans.factory.supprt;


import com.dpeng.springframework.beans.BeansException;
import com.dpeng.springframework.beans.factory.config.BeanDefinition;

import java.lang.reflect.Constructor;

/**
 * Bean 的实例化策略
 */
public interface InstantiationStrategy {

    Object instantiate(BeanDefinition beanDefinition, String beanName, Constructor ctor, Object[] args) throws BeansException;
}