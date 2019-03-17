package study.pattern.proxy.jdkproxy;

public class JdkproxyTest {
    public static void main(String[] args) {
        ZhangSan zhangSan = new ZhangSan();
        Lisi lisi = new Lisi();
//        Person obj = (Person) new ZhongJie().getInstance(zhangSan);
        Person obj = (Person) new ZhongJie().getInstance(lisi);
        obj.findHouse();
    }
}
