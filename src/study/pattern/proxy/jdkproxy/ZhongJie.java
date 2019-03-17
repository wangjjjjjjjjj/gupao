package study.pattern.proxy.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

//jdk代理必须继承一个接口
public class ZhongJie implements InvocationHandler {
    private Person target = null;
    public Object getInstance(Person p){
        this.target = p;
        Class<?> clazz = target.getClass();

        return Proxy.newProxyInstance(clazz.getClassLoader(),clazz.getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("中介开始帮你找房子");
        target.findHouse();
        System.out.println("找好房子了，给我付钱");
        return null;
    }
}
