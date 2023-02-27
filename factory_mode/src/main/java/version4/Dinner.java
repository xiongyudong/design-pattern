package version4;

import version4.event.DinnerEvent;
import version4.event.DinnerListener;

import java.util.ArrayList;
import java.util.List;

public class Dinner implements Runnable {

    List<DinnerListener> dinnerListenerList = new ArrayList();

    public void addListener(DinnerListener dinnerListener) {
        this.dinnerListenerList.add(dinnerListener);
    }

    public void removeListener(DinnerListener dinnerListener) {
        this.dinnerListenerList.remove(dinnerListener);
    }

    public void run() {
        try {
            System.out.println("V4 等待上菜---");
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("V4 上菜完毕，开吃");
        // 去吃火锅
        eatHotPot();

        // 吃炒菜
        friedDish();
    }

    public void publishDinnerEvent(DinnerEvent dinnerEvent) {
        for (DinnerListener dinnerListener : dinnerListenerList) {
            dinnerListener.update(dinnerEvent);
        }
    }

    private void eatHotPot() {
        publishDinnerEvent(new DinnerEvent(1));
    }

    private void friedDish() {
        publishDinnerEvent(new DinnerEvent(2));
    }
}
