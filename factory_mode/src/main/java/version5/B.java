package version5;

import version5.event.DinnerEvent;
import version5.event.DinnerListener;

public class B implements DinnerListener<DinnerEvent> {

    public void update(DinnerEvent dinnerEvent) {
        switch (dinnerEvent.getType()) {
            case 1:
                System.out.println("V5 吃火锅的时候 小B喜欢吃鸳鸯锅" + Thread.currentThread().getName());
                break;
            case 2:
                System.out.println("V5 吃炒菜的时候 小B喜欢吃热菜" + Thread.currentThread().getName());
                break;
            default:
                System.out.println("不做任何事情");
                break;
        }
    }
}
