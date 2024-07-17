package com.dpeng.springframework.test.common;


import com.dpeng.springframework.beans.BeansException;
import com.dpeng.springframework.beans.PropertyValue;
import com.dpeng.springframework.beans.PropertyValues;
import com.dpeng.springframework.beans.factory.ConfigurableListableBeanFactory;
import com.dpeng.springframework.beans.factory.config.BeanDefinition;
import com.dpeng.springframework.beans.factory.config.BeanFactoryPostProcessor;


public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        BeanDefinition beanDefinition = beanFactory.getBeanDefinition("userService");
        PropertyValues propertyValues = beanDefinition.getPropertyValues();
        propertyValues.addPropertyValue(new PropertyValue("company", "改为：字节跳动"));
    }
}