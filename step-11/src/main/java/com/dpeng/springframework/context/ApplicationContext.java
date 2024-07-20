package com.dpeng.springframework.context;

import com.dpeng.springframework.core.io.ResourceLoader;
import com.dpeng.springframework.beans.factory.HierarchicalBeanFactory;
import com.dpeng.springframework.beans.factory.ListableBeanFactory;

/**
 * @author KeyCheung
 * @date 2023/05/21
 * @desc
 */
public interface ApplicationContext extends ListableBeanFactory, HierarchicalBeanFactory, ResourceLoader, ApplicationEventPublisher {
}