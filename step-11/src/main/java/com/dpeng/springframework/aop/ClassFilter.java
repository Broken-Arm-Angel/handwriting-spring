package com.dpeng.springframework.aop;


public interface ClassFilter {

    boolean matches(Class<?> clazz);
}