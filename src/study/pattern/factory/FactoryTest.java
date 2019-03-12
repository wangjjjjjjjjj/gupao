package study.pattern.factory;

import study.pattern.factory.abstr.HuaweiFactory;

public class FactoryTest {
    public static void main(String[] args) {
        //简单工厂模式
        /*FactoryMobile f = new FactoryMobile();
        Mobile m = f.getInstance("study.pattern.factory.simple.HUAWEIMobile");
        m.call();*/
        //工厂方法模式
        /*MobileFactory mf = new AppleFactory();
        Mobile m = mf.getInstance();
        m.call();*/

        //抽象工厂模式
        HuaweiFactory a = new HuaweiFactory();
        a.call().call();
        a.playGame().playGame();
    }
}
