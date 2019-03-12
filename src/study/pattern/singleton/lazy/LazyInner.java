package study.pattern.singleton.lazy;

public class LazyInner {
    private LazyInner() {
        if(InnerClass.lazy!= null){
            throw new RuntimeException("不允许建立多个实例");
        }
    }



    private static class InnerClass{

        private static final  LazyInner lazy = new LazyInner();
    }

    public static final LazyInner getInstance(){
            return InnerClass.lazy;
    }
}
