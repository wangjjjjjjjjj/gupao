package study.pattern.proxy.jdkproxyshouxie;

import java.lang.reflect.Method;

public interface MyInvocationHandler {
    Object invoke(Object Proxy, Method method, Object args[]) throws Throwable;
}
