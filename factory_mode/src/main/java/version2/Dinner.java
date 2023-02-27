package version2;

public class Dinner implements Runnable {

    A a;
    B b;

    public Dinner(A a, B b) {
        this.a = a;
        this.b = b;
    }

    public void run() {
        try {
            System.out.println("V2 等待上菜---");
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("V2 上菜完毕，开吃");
        notifyObservers();
    }

    public void notifyObservers() {
        a.water();
        b.coldDish();
    }


}
