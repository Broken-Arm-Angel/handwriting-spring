package com.dpeng.springframework.context;


public interface ApplicationEventPublisher {

    void publishEvent(ApplicationEvent event);
}