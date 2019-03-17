package study.pattern.proxy.Cglibproxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class Zhongjie implements MethodInterceptor {
    public Object getInstance(Class<?> clazz){
        Enhancer enhancer = new Enhancer();

        enhancer.setSuperclass(clazz);
        enhancer.setCallback(this);

        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("中介开始帮你找房子");
        methodProxy.invokeSuper(o,objects);
        System.out.println("找好房子了，给我付钱");
        return null;
    }
}
