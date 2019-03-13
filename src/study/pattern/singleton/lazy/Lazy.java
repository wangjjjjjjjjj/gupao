package study.pattern.singleton.lazy;

public class Lazy {
//加载时不会初始化实例，只有当第一次使用的时候才会初始化，实现了延时加载
    //缺点：线程不安全,需要双重锁校验，而这样会影响系统效率
    private static Lazy lazy = null;

    private Lazy(){}

    public static Lazy getInstance(){
        //双重锁
        if(lazy == null){
            synchronized (Lazy.class) {
                if(lazy == null) {
                    lazy = new Lazy();
                }
            }
        }
        return lazy;
    }


}
