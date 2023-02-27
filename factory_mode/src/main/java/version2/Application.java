package version2;

public class Application {

    public static void main(String[] args) {
        Thread thread = new Thread(new Dinner(new A(), new B()));
        thread.start();
    }
}
