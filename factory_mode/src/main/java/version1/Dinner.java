package version1;

public class Dinner implements Runnable {

    private volatile boolean canEat;

    public void run() {
        try {
            System.out.println("V1 等待上菜---");
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("V1 上菜完毕，开吃");
        startEat();
    }

    private void startEat() {
        this.setCanEat(true);
    }

    public boolean canEat() {
        return canEat;
    }

    public void setCanEat(boolean canEat) {
        this.canEat = canEat;
    }
}
