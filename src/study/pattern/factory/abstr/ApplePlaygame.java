package study.pattern.factory.abstr;

public class ApplePlaygame implements  PlaygameFactory {
    @Override
    public void playGame() {
        System.out.println("苹果手机打游戏");
    }
}
