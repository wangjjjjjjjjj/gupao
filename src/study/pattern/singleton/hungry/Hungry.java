package study.pattern.singleton.hungry;

 class Hungry {
//加载时就已经将实例初始化
     //不管你有没有开始使用
     //优点：线程安全
     //缺点：造成资源浪费，工程的加载时间变长
    private Hungry(){}

    private static final Hungry hungry = new Hungry();

    static Hungry getInstance(){
        return hungry;
    }

}
