package com.dpeng.springframework.context.support;

import com.dpeng.springframework.beans.factory.support.DefaultListableBeanFactory;
import com.dpeng.springframework.beans.BeansException;
import com.dpeng.springframework.beans.factory.ConfigurableListableBeanFactory;

/**
 * @author KeyCheung
 * @date 2023/05/20
 * @desc
 */
public abstract class AbstractRefreshableApplicationContext extends AbstractApplicationContext {

    private DefaultListableBeanFactory beanFactory;

    @Override
    protected void refreshBeanFactory() throws BeansException {
        DefaultListableBeanFactory beanFactory = createBeanFactory();
        loadBeanDefinition(beanFactory);
        this.beanFactory = beanFactory;
    }

    private DefaultListableBeanFactory createBeanFactory() {
        return new DefaultListableBeanFactory();
    }

    protected abstract void loadBeanDefinition(DefaultListableBeanFactory beanFactory);

    @Override
    protected ConfigurableListableBeanFactory getBeanFactory() {
        return beanFactory;
    }
}