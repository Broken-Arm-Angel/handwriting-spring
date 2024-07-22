package com.dpeng.springframework.context.event;

import com.dpeng.springframework.beans.factory.BeanFactory;
import com.dpeng.springframework.context.ApplicationEvent;
import com.dpeng.springframework.context.ApplicationListener;


public class SimpleApplicationEventMulticaster extends AbstractApplicationEventMulticaster {

    public SimpleApplicationEventMulticaster(BeanFactory beanFactory) {
        setBeanFactory(beanFactory);
    }

    @Override
    public void multicastEvent(final ApplicationEvent event) {
        for (final ApplicationListener listener : getApplicationListeners(event)) {
            listener.onApplicationEvent(event);
        }
    }
}