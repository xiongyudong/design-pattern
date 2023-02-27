package version4;

public class Application {

    public static void main(String[] args) {
        Dinner dinner = new Dinner();
        dinner.addListener(new A());
        dinner.addListener(new B());

        Thread thread = new Thread(dinner);
        thread.start();
    }
}
