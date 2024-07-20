package com.dpeng.springframework.beans.factory;

import com.dpeng.springframework.beans.factory.config.AutowireCapableBeanFactory;
import com.dpeng.springframework.beans.factory.config.BeanDefinition;
import com.dpeng.springframework.beans.factory.config.ConfigurableBeanFactory;
import com.dpeng.springframework.beans.BeansException;

/**
 * @author KeyCheung
 * @date 2023/05/19
 * @desc
 */
public interface ConfigurableListableBeanFactory extends ListableBeanFactory, AutowireCapableBeanFactory, ConfigurableBeanFactory {

    BeanDefinition getBeanDefinition(String beanName) throws BeansException;

    void preInstantiateSingletons() throws BeansException;
}