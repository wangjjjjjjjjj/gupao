package study.pattern.proxy.jdkproxyshouxie;

import study.pattern.proxy.jdkproxy.Lisi;
import study.pattern.proxy.jdkproxy.Person;
import study.pattern.proxy.jdkproxy.ZhangSan;
import sun.misc.ProxyGenerator;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class JdkproxyTest {
    public static void main(String[] args) {
//        ZhangSan zhangSan = new ZhangSan();
        Lisi lisi = new Lisi();
//        Person obj = (Person) new ZhongJie().getInstance(zhangSan);
        Person obj = (Person) new ZhongJie().getInstance(lisi);
        obj.findHouse();

    }
}
