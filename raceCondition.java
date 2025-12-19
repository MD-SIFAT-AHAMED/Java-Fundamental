
class Counter {

    int count;

    public synchronized void incremnet() {
        count++;
    }
}

public class raceCondition {

    public static void main(String[] args) throws InterruptedException {
        Counter c = new Counter();
        Runnable objA = () -> {

            for (int i = 0; i < 100; i++) {
                c.incremnet();
            }

        };
        Runnable objB = () -> {

            for (int i = 0; i < 100; i++) {
                c.incremnet();
            }

        };

        Thread t1 = new Thread(objA);
        Thread t2 = new Thread(objB);
        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(c.count);
    }
}
