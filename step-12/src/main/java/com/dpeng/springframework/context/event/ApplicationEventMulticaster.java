package com.dpeng.springframework.context.event;

import com.dpeng.springframework.context.ApplicationEvent;
import com.dpeng.springframework.context.ApplicationListener;


public interface ApplicationEventMulticaster {

    void addApplicationListener(ApplicationListener<?> listener);

    void removeApplicationListener(ApplicationListener<?> listener);

    void multicastEvent(ApplicationEvent event);
}