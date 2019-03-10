package study.pattern.factory.abstr;

public class AppleCall implements CallFactory{
    @Override
    public void call() {
        System.out.println("苹果手机打电话");
    }
}
