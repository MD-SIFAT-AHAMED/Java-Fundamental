
class Human {

    String name;
    int age;

    public Human() {
        this.name = "sifat ahamed";
        this.age = 25;
    }

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

}

public class constructor {

    public static void main(String[] args) {
        Human obj = new Human();
        System.out.println(obj.name + " and " + obj.age);
        Human obj2 = new Human("sifat", 12);
        System.out.println(obj2.name + " and " + obj2.age);

    }
}
