package com.dpeng.springframework.context;


import com.dpeng.springframework.beans.BeansException;
import com.dpeng.springframework.beans.factory.Aware;

public interface ApplicationContextAware extends Aware {

    void setApplicationContext(ApplicationContext applicationContext) throws BeansException;
}