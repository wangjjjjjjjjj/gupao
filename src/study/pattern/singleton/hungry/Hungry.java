package study.pattern.singleton.hungry;

 class Hungry {

    private Hungry(){}

    private static final Hungry hungry = new Hungry();

    static Hungry getInstance(){
        return hungry;
    }

}
