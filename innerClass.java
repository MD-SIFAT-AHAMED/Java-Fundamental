
class A {

    public void getName() {
        System.out.println("Siat Ahamed");
    }

    static class B {

        public void getAge() {
            System.out.println("23");
        }
    }
}

public class innerClass {

    public static void main(String[] args) {
        A obj = new A();
        obj.getName();

        // A.B obj1 = obj.new B();    // Jodi B class a Static nh kori
        A.B obj1 = new A.B();
        obj1.getAge();

    }
}
