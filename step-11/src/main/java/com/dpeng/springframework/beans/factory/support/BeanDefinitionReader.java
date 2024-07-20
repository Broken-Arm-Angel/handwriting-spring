package com.dpeng.springframework.beans.factory.support;

import com.dpeng.springframework.core.io.Resource;
import com.dpeng.springframework.core.io.ResourceLoader;
import com.dpeng.springframework.beans.BeansException;

/**
 * @author KeyCheung
 * @date 2023/05/20
 * @desc
 */
public interface BeanDefinitionReader {

    BeanDefinitionRegistry getRegistry();

    ResourceLoader getResourceLoader();

    void loadBeanDefinitions(Resource resource) throws BeansException;

    void loadBeanDefinitions(Resource... resources) throws BeansException;

    void loadBeanDefinitions(String location) throws BeansException;

    void loadBeanDefinitions(String... locations) throws BeansException;
}