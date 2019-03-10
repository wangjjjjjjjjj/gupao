package study.pattern.factory.simple;

public class AppleMobile implements Mobile{
    @Override
    public void call() {
        System.out.println("苹果手机拨打电话");
    }
}
