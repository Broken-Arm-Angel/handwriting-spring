package com.dpeng.springframework.beans.factory;

/**
 * @author KeyCheung
 * @date 2023/05/20
 * @desc
 */
public interface InitializingBean {

    void afterPropertiesSet() throws Exception;
}