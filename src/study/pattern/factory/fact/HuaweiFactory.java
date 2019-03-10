package study.pattern.factory.fact;

import study.pattern.factory.simple.HUAWEIMobile;
import study.pattern.factory.simple.Mobile;

public class HuaweiFactory implements MobileFactory {
    @Override
    public Mobile getInstance() {
        return new HUAWEIMobile();
    }
}
