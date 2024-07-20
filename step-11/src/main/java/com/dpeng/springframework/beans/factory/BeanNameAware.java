package com.dpeng.springframework.beans.factory;

import com.dpeng.springframework.beans.BeansException;

/**
 * @author KeyCheung
 * @date 2023/05/21
 * @desc
 */
public interface BeanNameAware extends Aware {

    void setBeanName(String name) throws BeansException;
}