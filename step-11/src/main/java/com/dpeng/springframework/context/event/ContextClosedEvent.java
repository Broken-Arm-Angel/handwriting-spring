package com.dpeng.springframework.context.event;

/**
 * @author KeyCheung
 * @date 2023/05/30
 * @desc
 */
public class ContextClosedEvent extends ApplicationContextEvent {

    public ContextClosedEvent(Object source) {
        super(source);
    }
}