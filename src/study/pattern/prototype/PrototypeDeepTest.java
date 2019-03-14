package study.pattern.prototype;

import java.util.ArrayList;
import java.util.List;

public class PrototypeDeepTest {
    public static void main(String[] args) {
        PrototypeDeep a = new PrototypeDeep();
        a.setA("1");
        a.setB("2");
        List list = new ArrayList();
        list.add("3");
        list.add("4");
        a.setC(list);
        PrototypeDeep b = (PrototypeDeep) a.clone();

        System.out.println(a.getC() == b.getC());
        list.add("5");
        System.out.println(a.getC());
        System.out.println(b.getC());
    }
}
