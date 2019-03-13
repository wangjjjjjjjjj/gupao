package study.pattern.singleton.register;

public class RegisterTest {
    public static void main(String[] args) {
        LazyEnum lazy = LazyEnum.valueOf("INSTANCE");
        System.out.println(lazy);
    }
}
