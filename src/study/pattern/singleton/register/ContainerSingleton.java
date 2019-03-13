package study.pattern.singleton.register;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ContainerSingleton {
    //方便管理，常用于spring中
    private Map<String,Object> ioc = new ConcurrentHashMap<String,Object>();
    private ContainerSingleton(){}

    private Object getInstance(String className){
        Object con = null;
        if(ioc.containsKey(className)){
            con = (ContainerSingleton) ioc.get(className);
        }else {
            synchronized (ContainerSingleton.class) {
                if(!ioc.containsKey(className)) {
                    try {
                        con = Class.forName(className).newInstance();
                        ioc.put(className, con);
                    }catch (Exception e){
                        e.printStackTrace();
                    }

                }
            }
        }
        return con;
    }
}
