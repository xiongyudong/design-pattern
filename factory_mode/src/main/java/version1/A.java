package version1;

public class A implements Runnable {

    Dinner dinner;

    public A(Dinner dinner) {
        this.dinner = dinner;
    }

    public void run() {
        while(true) {
            if (dinner.canEat()) {
                System.out.println("V1 小A先喝了一杯水");
                return;
            }
        }
    }
}
