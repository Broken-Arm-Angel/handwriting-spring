package com.dpeng.springframework.context.event;

import com.dpeng.springframework.context.ApplicationEvent;
import com.dpeng.springframework.context.ApplicationListener;

/**
 * @author KeyCheung
 * @date 2023/05/30
 * @desc
 */
public interface ApplicationEventMulticaster {

    void addApplicationListener(ApplicationListener<?> listener);

    void removeApplicationListener(ApplicationListener<?> listener);

    void multicastEvent(ApplicationEvent event);
}