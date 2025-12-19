
class A implements Runnable {

    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Sifat");
            try {
                Thread.sleep(1);
            } catch (Exception e) {
            }
        }
    }
}

class B implements Runnable {

    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Sifat Ahamed");
            try {
                Thread.sleep(1);
            } catch (Exception e) {
            }
        }
    }
}

public class threadRunnable {

    public static void main(String[] args) {
        Runnable objA = new A();
        // Runnable objB = new B();

        // Runnable objB lang expression convert
        Runnable objB = () -> {

            for (int i = 0; i < 10; i++) {
                System.out.println("hay hay");
                try {
                    Thread.sleep(1);
                } catch (Exception e) {
                }
            }
        };

        Thread t1 = new Thread(objA);
        Thread t2 = new Thread(objB);

        t1.start();
        t2.start();
    }
}
