package com.dpeng.springframework.context;

/**
 * @author KeyCheung
 * @date 2023/05/30
 * @desc
 */
public interface ApplicationEventPublisher {

    void publishEvent(ApplicationEvent event);
}