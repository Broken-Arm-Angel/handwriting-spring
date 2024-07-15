package com.dpeng.springframework.beans.factory.supprt;


import com.dpeng.springframework.beans.BeansException;
import com.dpeng.springframework.io.Resource;
import com.dpeng.springframework.io.ResourceLoader;

/**
 * Simple interface for bean definition readers.
 */
public interface BeanDefinitionReader {

    BeanDefinitionRegistry getRegistry();

    ResourceLoader getResourceLoader();

    void loadBeanDefinitions(Resource resource) throws BeansException;

    void loadBeanDefinitions(Resource... resources) throws BeansException;

    void loadBeanDefinitions(String location) throws BeansException;
}