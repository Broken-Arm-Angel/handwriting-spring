package com.dpeng.springframework.context;

import com.dpeng.springframework.beans.BeansException;
import com.dpeng.springframework.beans.factory.Aware;

/**
 * @author KeyCheung
 * @date 2023/05/30
 * @desc
 */
public interface ApplicationContextAware extends Aware {

    void setApplicationContext(ApplicationContext applicationContext) throws BeansException;
}