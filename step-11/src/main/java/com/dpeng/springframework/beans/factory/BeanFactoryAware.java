package com.dpeng.springframework.beans.factory;

import com.dpeng.springframework.beans.BeansException;


public interface BeanFactoryAware extends Aware {

    void setBeanFactory(BeanFactory beanFactory) throws BeansException;
}