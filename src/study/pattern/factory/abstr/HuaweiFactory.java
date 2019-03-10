package study.pattern.factory.abstr;

public class HuaweiFactory implements AbstactFactory {


    @Override
    public CallFactory call() {
        return new HuaweiCall();
    }

    @Override
    public PlaygameFactory playGame() {
        return new HuaweiPlaygame();
    }
}
