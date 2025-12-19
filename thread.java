
class A extends Thread {

    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println("Sifat");
            try {
                Thread.sleep(1);
            } catch (Exception e) {
                System.err.println(e);
            }
        }
    }
}

class B extends Thread {

    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Ahamed");
            try {
                Thread.sleep(1);
            } catch (Exception e) {
                System.err.println(e);
            }
        }
    }
}

public class thread {

    public static void main(String[] args) {
        A objA = new A();
        B objB = new B();

        objA.start();
        objB.start();
    }
}
