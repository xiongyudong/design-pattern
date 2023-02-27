package version1;

public class B implements Runnable {

    Dinner dinner;

    public B(Dinner dinner) {
        this.dinner = dinner;
    }

    public void run() {
        while(true) {
            if (dinner.canEat()) {
                System.out.println("V1 小B先吃凉菜");
                return;
            }
        }
    }

}
