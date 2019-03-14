package study.pattern.prototype;

import java.util.List;
//浅克隆，只是将值的引用克隆过去，若值发送变化
public class PrototypeShallow implements IProto {
    private String a;
    private String b;
    private List c;

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    public List getC() {
        return c;
    }

    public void setC(List c) {
        this.c = c;
    }

    @Override
    public Object clone() {
        PrototypeShallow prototypeInstance = new PrototypeShallow();
        prototypeInstance.setA(this.a);
        prototypeInstance.setB(this.b);
        prototypeInstance.setC(this.c);


        return prototypeInstance;
    }
}
