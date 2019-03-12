package study.pattern.singleton.hungry;

public class HungryTest {

    public static void main(String[] args) {
        Hungry a = Hungry.getInstance();
        Hungry b = Hungry.getInstance();

        System.out.println(a == b);
    }
}
