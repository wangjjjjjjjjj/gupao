package study.pattern.singleton.register;

public enum LazyEnum {
    //jdk设计中已经不允许枚举对象通过反射创建，也不能通过序列化来破话单例，
    //所以枚举式单例是一种比较推荐的写法
    INSTANCE;
    public LazyEnum getInstance(){
        return INSTANCE;
    }
}
