package com.dpeng.springframework.context;

import com.dpeng.springframework.beans.factory.HierarchicalBeanFactory;
import com.dpeng.springframework.beans.factory.ListableBeanFactory;
import com.dpeng.springframework.core.io.ResourceLoader;


public interface ApplicationContext extends ListableBeanFactory, HierarchicalBeanFactory, ResourceLoader, ApplicationEventPublisher {
}