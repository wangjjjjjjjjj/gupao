package study.pattern.factory.abstr;

public class HuaweiCall implements CallFactory {
    @Override
    public void call() {
        System.out.println("华为手机打电话");
    }
}
