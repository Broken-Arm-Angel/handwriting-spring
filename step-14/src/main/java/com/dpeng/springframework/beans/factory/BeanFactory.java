package com.dpeng.springframework.beans.factory;

import com.dpeng.springframework.beans.BeansException;


public interface BeanFactory {

    Object getBean(String name) throws BeansException;

    Object getBean(String name, Object[] args) throws BeansException;

    <T> T getBean(String name, Class<T> requiredType) throws BeansException;

    <T> T getBean(Class<T> requiredType) throws BeansException;
}