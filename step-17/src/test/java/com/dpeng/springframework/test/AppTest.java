package com.dpeng.springframework.test;

import com.dpeng.springframework.core.convert.converter.Converter;
import com.dpeng.springframework.core.convert.support.StringToNumberConverterFactory;
import com.dpeng.springframework.test.converter.StringToIntegerConverter;
import com.dpeng.springframework.context.support.ClassPathXmlApplicationContext;
import com.dpeng.springframework.test.bean.Husband;
import junit.framework.TestCase;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase {

    public void testConvert() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring.xml");
        Husband husband = applicationContext.getBean("husband", Husband.class);
        System.out.println("测试结果：" + husband);
    }

    public void testStringToIntegerConverter() {
        StringToIntegerConverter converter = new StringToIntegerConverter();
        Integer num = converter.convert("1234");
        System.out.println("测试结果：" + num);
    }

    public void testStringToNumberConverterFactory() {
        StringToNumberConverterFactory converterFactory = new StringToNumberConverterFactory();

        Converter<String, Integer> stringToIntegerConverter = converterFactory.getConverter(Integer.class);
        System.out.println("测试结果：" + stringToIntegerConverter.convert("1234"));

        Converter<String, Long> stringToLongConverter = converterFactory.getConverter(Long.class);
        System.out.println("测试结果：" + stringToLongConverter.convert("1234"));
    }
}