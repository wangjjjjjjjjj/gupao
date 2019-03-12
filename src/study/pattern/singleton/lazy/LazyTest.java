package study.pattern.singleton.lazy;

public class LazyTest {
    public static void main(String[] args) {
//        Lazy a =Lazy.getInstanc();
//        Lazy b =Lazy.getInstanc();
//        System.out.println(a == b);
        //懒汉式单例
        Thread a = new Thread(new ThreadExector());
        Thread b = new Thread(new ThreadExector());
        a.start();
        b.start();
        System.out.println("end");


    }



}
