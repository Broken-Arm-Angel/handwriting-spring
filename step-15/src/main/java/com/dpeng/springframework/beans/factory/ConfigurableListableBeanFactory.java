package com.dpeng.springframework.beans.factory;

import com.dpeng.springframework.beans.BeansException;
import com.dpeng.springframework.beans.factory.config.AutowireCapableBeanFactory;
import com.dpeng.springframework.beans.factory.config.BeanDefinition;
import com.dpeng.springframework.beans.factory.config.ConfigurableBeanFactory;


public interface ConfigurableListableBeanFactory extends ListableBeanFactory, AutowireCapableBeanFactory, ConfigurableBeanFactory {

    BeanDefinition getBeanDefinition(String beanName) throws BeansException;

    void preInstantiateSingletons() throws BeansException;
}