package com.dpeng.springframework.beans.factory.support;


import com.dpeng.springframework.beans.BeansException;
import com.dpeng.springframework.beans.factory.config.BeanDefinition;

import java.lang.reflect.Constructor;

public interface InstantiationStrategy {

    Object instantiate(BeanDefinition beanDefinition, String beanName, Constructor ctor, Object[] args) throws BeansException;
}