package study.pattern.factory.abstr;


public class AppleFactory implements AbstactFactory {

    @Override
    public CallFactory call() {
        return new AppleCall();
    }

    @Override
    public PlaygameFactory playGame() {
        return new ApplePlaygame();
    }
}
