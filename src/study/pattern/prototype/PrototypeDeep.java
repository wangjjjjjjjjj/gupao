package study.pattern.prototype;

import java.io.*;
import java.util.List;

public class PrototypeDeep implements IProto, Serializable {
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
        Object obj = null;
        //利用序列化进行深克隆
        try {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);
            obj =  ois.readObject();


        } catch (Exception e) {
            e.printStackTrace();
        }


        return obj;
    }
}
