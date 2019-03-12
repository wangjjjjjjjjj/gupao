package study.pattern.singleton.lazy;

public class Lazy {
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
