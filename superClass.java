
class A {

    public A() {
        System.err.println("A");
    }
     public A(int a){
        System.err.println("Int A");
    }
}

class B extends A {

    public B() {
        System.out.println("B");
    }

    public B(int a){
        super(12);
        System.err.println("Int B");
    }
}

public class superClass {

    public static void main(String[] args) {
        B obj = new B(1);
    }
}
