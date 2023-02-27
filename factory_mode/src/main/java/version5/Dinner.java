package version5;

import org.springframework.lang.Nullable;
import version5.event.DinnerEvent;
import version5.event.DinnerListener;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

public class Dinner implements Runnable {

    @Nullable
    private Executor taskExecutor;

    List<DinnerListener> dinnerListenerList = new ArrayList();

    public void addListener(DinnerListener dinnerListener) {
        this.dinnerListenerList.add(dinnerListener);
    }

    public void removeListener(DinnerListener dinnerListener) {
        this.dinnerListenerList.remove(dinnerListener);
    }

    public void run() {
        try {
            System.out.println("V5 等待上菜---");
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("V5 上菜完毕，开吃");

        // 去吃火锅
        eatHotPot();

        // 吃炒菜
        friedDish();
    }

    public void setTaskExecutor(@Nullable Executor taskExecutor) {
        this.taskExecutor = taskExecutor;
    }

    public void publishDinnerEvent(DinnerEvent dinnerEvent) {
        if (taskExecutor != null) {
            for (DinnerListener dinnerListener : dinnerListenerList) {
                taskExecutor.execute(() -> {
                    dinnerListener.update(dinnerEvent);
                });
            }
        } else{
            for (DinnerListener dinnerListener : dinnerListenerList) {
                dinnerListener.update(dinnerEvent);
            }
        }

    }

    private void eatHotPot() {
        publishDinnerEvent(new DinnerEvent(1));
    }

    private void friedDish() {
        publishDinnerEvent(new DinnerEvent(2));
    }
}
