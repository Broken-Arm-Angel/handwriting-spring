package com.dpeng.springframework.beans.factory;


public interface BeanClassLoaderAware extends Aware {

    void setBeanClassLoader(ClassLoader classLoader);
}