package com.dpeng.springframework.beans.factory;

import com.dpeng.springframework.beans.BeansException;


public interface ObjectFactory<T> {

    T getObject() throws BeansException;
}