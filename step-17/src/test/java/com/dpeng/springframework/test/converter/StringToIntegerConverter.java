package com.dpeng.springframework.test.converter;

import com.dpeng.springframework.core.convert.converter.Converter;


public class StringToIntegerConverter implements Converter<String, Integer> {

    @Override
    public Integer convert(String source) {
        return Integer.valueOf(source);
    }
}