package com.dpeng.springframework.context.event;

import com.dpeng.springframework.context.ApplicationContext;
import com.dpeng.springframework.context.ApplicationEvent;

public class ApplicationContextEvent extends ApplicationEvent {

    public ApplicationContextEvent(Object source) {
        super(source);
    }

    public final ApplicationContext getApplicationContext() {
        return (ApplicationContext) getSource();
    }
}