package study.pattern.proxy.jdkproxy;

public class ZhangSan implements Person{
    @Override
    public void findHouse() {
        System.out.println("找一个便宜的房子");
    }
}
