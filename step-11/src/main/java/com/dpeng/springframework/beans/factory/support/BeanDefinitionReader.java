package com.dpeng.springframework.beans.factory.support;

import com.dpeng.springframework.core.io.Resource;
import com.dpeng.springframework.core.io.ResourceLoader;
import com.dpeng.springframework.beans.BeansException;


public interface BeanDefinitionReader {

    BeanDefinitionRegistry getRegistry();

    ResourceLoader getResourceLoader();

    void loadBeanDefinitions(Resource resource) throws BeansException;

    void loadBeanDefinitions(Resource... resources) throws BeansException;

    void loadBeanDefinitions(String location) throws BeansException;

    void loadBeanDefinitions(String... locations) throws BeansException;
}