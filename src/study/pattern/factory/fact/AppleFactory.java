package study.pattern.factory.fact;

import study.pattern.factory.simple.AppleMobile;
import study.pattern.factory.simple.Mobile;

public class AppleFactory implements MobileFactory {
    @Override
    public Mobile getInstance() {
        return new AppleMobile();
    }
}
