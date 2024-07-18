package com.dpeng.springframework.beans.factory;


import com.dpeng.springframework.beans.BeansException;

public interface BeanNameAware extends Aware {

    void setBeanName(String name) throws BeansException;
}