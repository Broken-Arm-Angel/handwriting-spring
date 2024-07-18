package com.dpeng.springframework.beans.factory;

public interface InitializingBean {

    void afterPropertiesSet() throws Exception;
}