package com.dpeng.springframework.beans.factory;


public interface DisposableBean {

    void destroy() throws Exception;
}