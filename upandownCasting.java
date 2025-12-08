
class A {

    public void show1() {
        System.out.println("show 1");
    }
}

class B extends A {

    public void show2() {
        System.out.println("show 2");
    }
}

public class upandownCasting {

    public static void main(String[] args) {
        A obj = (A) new B(); // This called upCasting beacuse of B class A er referance niche type casting kore
        obj.show1();

        B obj1 = (B) obj; // This called downCasting
        obj1.show2();
    }
}
