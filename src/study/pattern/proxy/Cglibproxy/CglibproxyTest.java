package study.pattern.proxy.Cglibproxy;

public class CglibproxyTest {
    public static void main(String[] args) {
        Wangwu wangwu = (Wangwu) new Zhongjie().getInstance(Wangwu.class);

        wangwu.findHouse();
    }
}
