package com.dpeng.springframework.beans.factory.support;


import com.dpeng.springframework.beans.BeansException;
import com.dpeng.springframework.beans.factory.BeanFactory;
import com.dpeng.springframework.beans.factory.config.BeanDefinition;

/**
 * 抽象 Bean 工厂
 */
public abstract class AbstractBeanFactory extends DefaultSingletonBeanRegistry implements BeanFactory {

    @Override
    public Object getBean(String beanName) throws BeansException {
        Object singleton = getSingleton(beanName);
        if (singleton != null) {
            return singleton;
        }
        BeanDefinition beanDefinition = getBeanDefinition(beanName);
        return createBean(beanName, beanDefinition);
    }

    protected abstract BeanDefinition getBeanDefinition(String beanName) throws BeansException;

    protected abstract Object createBean(String beanName, BeanDefinition beanDefinition) throws BeansException;
}