package version3;

import version3.observer.DinnerObserver;

public class B implements DinnerObserver {

    public void action() {
        System.out.println("V3 小B先吃凉菜");
    }
}
