package version3;

import version3.observer.DinnerObserver;

public class A implements DinnerObserver {

    public void action() {
        System.out.println("V3 小A先喝了一杯水");
    }
}
