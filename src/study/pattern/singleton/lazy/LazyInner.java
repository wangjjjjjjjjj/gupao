package study.pattern.singleton.lazy;

public class LazyInner {
    //完美的解决懒汉式单例和饿汉式单例的缺点
    //只有第一次调用的时候才会加载内部类，由内部类来初始化实例
    //而内部类只会加载一次，避免了线程安全问题
    private LazyInner() {
        if(InnerClass.lazy!= null){
            throw new RuntimeException("不允许建立多个实例");
        }
    }



    private static class InnerClass{

        private static final  LazyInner lazy = new LazyInner();
    }

    public static final LazyInner getInstance(){
            return InnerClass.lazy;
    }
}
