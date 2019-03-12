package study.pattern.singleton.lazy;

public class ThreadExector implements Runnable {
    @Override
    public void run() {
        LazyInner lazy = LazyInner.getInstance();
        System.out.println(Thread.currentThread().getName()+":"+lazy);
    }
}
