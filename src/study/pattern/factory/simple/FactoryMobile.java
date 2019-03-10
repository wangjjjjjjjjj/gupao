package study.pattern.factory.simple;

public class FactoryMobile {
    //简单工厂模式
    /*public Mobile getInstance(String className){
        if("Huawei".equals(className)){
            return new HUAWEIMobile();
        }else if("AppleCall".equals(className)){
            return new AppleMobile();
        }else{
            return null;
        }
    }*/

    public Mobile getInstance(String className) {
        Mobile m = null;
        try {
            Class clazz = Class.forName(className);
            m = (Mobile)clazz.newInstance();
            return m;
        }catch(Exception e){
            e.printStackTrace();
        }
        return m;
    }
}
