package com.dpeng.springframework.beans.factory.support;

import com.dpeng.springframework.beans.BeansException;
import com.dpeng.springframework.io.Resource;
import com.dpeng.springframework.io.ResourceLoader;

public interface BeanDefinitionReader {

    BeanDefinitionRegistry getRegistry();

    ResourceLoader getResourceLoader();

    void loadBeanDefinitions(Resource resource) throws BeansException;

    void loadBeanDefinitions(Resource... resources) throws BeansException;

    void loadBeanDefinitions(String location) throws BeansException;

    void loadBeanDefinitions(String... locations) throws BeansException;
}