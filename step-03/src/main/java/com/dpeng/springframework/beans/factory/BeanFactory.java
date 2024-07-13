package com.dpeng.springframework.beans.factory;


import com.dpeng.springframework.beans.BeansException;

/**
 * Bean 工厂接口
 */
public interface BeanFactory {

    Object getBean(String name) throws BeansException;

    Object getBean(String name, Object... args) throws BeansException;

}