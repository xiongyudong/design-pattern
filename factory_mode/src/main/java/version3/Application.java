package version3;

public class Application {

    public static void main(String[] args) {
        Dinner dinner = new Dinner();
        dinner.addObserver(new A());
        dinner.addObserver(new B());

        Thread thread = new Thread(dinner);
        thread.start();

    }
}
