
interface A {

    void getName();

    void getAge();
}

interface X {

    void getDeparment();
}

class B implements A {

    // @Override
    public void getName() {
        System.out.println("Show get Name");
    }

    public void getAge() {
        System.out.println("Show get Age");
    }
}

class C implements A, X {

    @Override
    public void getAge() {
        System.out.println("get age");
    }

    @Override
    public void getName() {
        System.out.println("get name");
    }

    @Override
    public void getDeparment() {
        System.out.println("get department");
    }
}

public class interfaceJava {

    public static void main(String[] args) {
        A obj = new B();
        obj.getName();
        obj.getAge();
    }
}
