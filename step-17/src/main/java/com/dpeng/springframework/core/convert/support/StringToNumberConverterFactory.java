package com.dpeng.springframework.core.convert.support;

import com.dpeng.springframework.util.NumberUtils;
import com.dpeng.springframework.core.convert.converter.Converter;
import com.dpeng.springframework.core.convert.converter.ConverterFactory;
import org.jetbrains.annotations.Nullable;


public class StringToNumberConverterFactory implements ConverterFactory<String, Number> {

    @Override
    public <T extends Number> Converter<String, T> getConverter(Class<T> targetType) {
        return new StringToNumber<>(targetType);
    }

    private static final class StringToNumber<T extends Number> implements Converter<String, T> {

        private final Class<T> targetType;

        public StringToNumber(Class<T> targetType) {
            this.targetType = targetType;
        }

        @Override
        @Nullable
        public T convert(String source) {
            if (source.isEmpty()) {
                return null;
            }
            return NumberUtils.parseNumber(source, this.targetType);
        }
    }
}