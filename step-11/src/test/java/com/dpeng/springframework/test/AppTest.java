package com.dpeng.springframework.test;


import com.dpeng.springframework.aop.AdvisedSupport;
import com.dpeng.springframework.aop.MethodMatcher;
import com.dpeng.springframework.aop.TargetSource;
import com.dpeng.springframework.aop.aspectj.AspectJExpressionPointcut;
import com.dpeng.springframework.aop.framework.Cglib2AopProxy;
import com.dpeng.springframework.aop.framework.JdkDynamicAopProxy;
import com.dpeng.springframework.aop.framework.ReflectiveMethodInvocation;
import com.dpeng.springframework.test.bean.IUserService;
import com.dpeng.springframework.test.bean.UserService;
import com.dpeng.springframework.test.bean.UserServiceInterceptor;
import junit.framework.TestCase;
import org.aopalliance.intercept.MethodInterceptor;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase {

    public void testAop() throws NoSuchMethodException {
        AspectJExpressionPointcut pointcut = new AspectJExpressionPointcut("execution(* com.dpeng.springframework.test.bean.UserService.*(..))");

        Class<UserService> clazz = UserService.class;
        Method method = clazz.getDeclaredMethod("queryUserInfo");

        System.out.println(pointcut.matches(clazz));
        System.out.println(pointcut.matches(method, clazz));
    }

    public void testDynamic() {
        // 目标对象
        IUserService userService = new UserService();
        // 组装代理信息
        AdvisedSupport advisedSupport = new AdvisedSupport();
        advisedSupport.setTargetSource(new TargetSource(userService));
        advisedSupport.setMethodInterceptor(new UserServiceInterceptor());
        advisedSupport.setMethodMatcher(new AspectJExpressionPointcut("execution(* com.dpeng.springframework.test.bean.IUserService.*(..))"));

        // 代理对象（JdkDynamicAopProxy）
        IUserService proxyJdk = (IUserService) new JdkDynamicAopProxy(advisedSupport).getProxy();
        // 测试调用
        System.out.println(proxyJdk.queryUserInfo());

        // 代理对象（Cglib2AopProxy）
        IUserService proxyCglib = (IUserService) new Cglib2AopProxy(advisedSupport).getProxy();
        // 测试调用
        System.out.println(proxyCglib.register("keycheung"));
    }

    public void testProxyClass() {
        IUserService userService = (IUserService) Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(),
                new Class[]{IUserService.class}, (proxy, method, args) -> "你被代理了");
        String result = userService.queryUserInfo();
        System.out.println(result);
    }

    public void testProxyMethod() {
        // 目标对象(可以替换成任何的目标对象)
        Object targetObj = new UserService();

        // AOP 代理
        IUserService proxy = (IUserService) Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(), targetObj.getClass().getInterfaces(), new InvocationHandler() {
            // 方法匹配器
            MethodMatcher methodMatcher = new AspectJExpressionPointcut("execution(* com.dpeng.springframework.test.bean.IUserService.*(..))");

            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                if (methodMatcher.matches(method, targetObj.getClass())) {
                    // 方法拦截器
                    MethodInterceptor methodInterceptor = invocation -> {
                        long start = System.currentTimeMillis();
                        try {
                            return invocation.proceed();
                        } finally {
                            System.out.println("监控 - Begin By AOP");
                            System.out.println("方法名称；" + invocation.getMethod().getName());
                            System.out.println("方法耗时：" + (System.currentTimeMillis() - start) + "ms");
                            System.out.println("监控 - End\r\n");
                        }
                    };

                    // 反射调用
                    return methodInterceptor.invoke(new ReflectiveMethodInvocation(targetObj, method, args));
                }
                return method.invoke(targetObj, args);
            }
        });
        String result = proxy.queryUserInfo();
        System.out.println("测试结果：" + result);
    }
}