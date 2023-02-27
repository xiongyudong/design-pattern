package version4;

import version4.event.DinnerEvent;
import version4.event.DinnerListener;

public class A implements DinnerListener<DinnerEvent> {

    public void update(DinnerEvent dinnerEvent) {
        switch (dinnerEvent.getType()) {
            case 1:
                System.out.println("V4 吃火锅的时候 小A喜欢吃番茄锅");
                break;
            case 2:
                System.out.println("V4 吃炒菜的时候 小A喜欢先吃凉菜");
                break;
            default:
                System.out.println("不做任何事情");
                break;
        }
    }
}
