package study.pattern.factory.abstr;

public class HuaweiPlaygame implements PlaygameFactory {
    @Override
    public void playGame() {
        System.out.println("华为手机打游戏");
    }
}
