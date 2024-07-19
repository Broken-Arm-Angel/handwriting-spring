package com.dpeng.springframework.beans.factory.config;

import com.dpeng.springframework.beans.BeansException;
import com.dpeng.springframework.beans.factory.ConfigurableListableBeanFactory;


public interface BeanFactoryPostProcessor {

    void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException;
}