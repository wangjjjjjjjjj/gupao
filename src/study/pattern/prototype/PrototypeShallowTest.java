package study.pattern.prototype;

import java.util.ArrayList;
import java.util.List;

public class PrototypeShallowTest {
    public static void main(String[] args) {
        PrototypeShallow prototypeShallow = new PrototypeShallow();

        prototypeShallow.setA("111");
        prototypeShallow.setB("BBB");
        List b = new ArrayList();
        b.add(1);
        b.add(2);
        prototypeShallow.setC(b);

        PrototypeShallow a = (PrototypeShallow) prototypeShallow.clone();
        System.out.println(prototypeShallow.getC() == a.getC());
        prototypeShallow.setA("2");
        b.add(3);
        System.out.println(a.getC());
    }



}
