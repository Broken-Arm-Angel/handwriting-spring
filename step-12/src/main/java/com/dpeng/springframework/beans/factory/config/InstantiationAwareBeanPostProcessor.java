package com.dpeng.springframework.beans.factory.config;

import com.dpeng.springframework.beans.BeansException;


public interface InstantiationAwareBeanPostProcessor extends BeanPostProcessor {

    Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException;
}