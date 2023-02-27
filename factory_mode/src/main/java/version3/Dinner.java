
package version3;

import version3.observer.DinnerObserver;

import java.util.ArrayList;
import java.util.List;

public class Dinner implements Runnable {

    List<DinnerObserver> dinnerObservers = new ArrayList<DinnerObserver>();

    public void addObserver(DinnerObserver dinnerObserver) {
        this.dinnerObservers.add(dinnerObserver);
    }

    public void removeObserver(DinnerObserver dinnerObserver) {
        this.dinnerObservers.remove(dinnerObserver);
    }

    public void run() {
        try {
            System.out.println("V3 等待上菜---");
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("V3 上菜完毕，开吃");
        notifyObservers();
    }

    public void notifyObservers() {
        for (DinnerObserver dinnerObserver : dinnerObservers) {
            dinnerObserver.action();
        }
    }

}
