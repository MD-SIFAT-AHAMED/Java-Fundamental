
class Human {

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    void setName(String name) {
        this.name = name;
    }

    void setAge(int age) {
        this.age = age;
    }

}

public class encapsulation {

    public static void main(String[] args) {
        Human obj = new Human();
        obj.setName("Sifat ahamed");
        obj.setAge(20);
        String name = obj.getName();
        int age = obj.getAge();
        System.out.println("Name is: " + name + " age is: " + age);
    }
}
