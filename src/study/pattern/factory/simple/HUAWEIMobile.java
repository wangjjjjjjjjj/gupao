package study.pattern.factory.simple;

public class HUAWEIMobile implements Mobile{

    @Override
    public void call() {
        System.out.println("华为手机拨打电话");
    }
}
