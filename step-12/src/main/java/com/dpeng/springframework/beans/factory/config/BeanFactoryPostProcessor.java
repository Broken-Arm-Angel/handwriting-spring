package com.dpeng.springframework.beans.factory.config;

import com.dpeng.springframework.beans.BeansException;
import com.dpeng.springframework.beans.factory.ConfigurableListableBeanFactory;

/**
 * @author KeyCheung
 * @date 2023/05/17
 * @desc
 */
public interface BeanFactoryPostProcessor {

    void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException;
}