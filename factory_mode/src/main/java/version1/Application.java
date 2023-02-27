package version1;

public class Application {

    public static void main(String[] args) {
        Dinner dinner = new Dinner();
        Thread threadDinner = new Thread(dinner);
        threadDinner.start();

        Thread threadA = new Thread(new A(dinner));
        threadA.start();

        Thread threadB = new Thread(new B(dinner));
        threadB.start();
    }
}
