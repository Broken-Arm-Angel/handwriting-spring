package com.dpeng.springframework.context;

import com.dpeng.springframework.beans.BeansException;

/**
 * @author KeyCheung
 * @date 2023/05/21
 * @desc
 */
public interface ConfigurableApplicationContext extends ApplicationContext {

    void refresh() throws BeansException;

    void registerShutdownHook();

    void close();
}