class Student {
    String name; //Property 
    int age;

    void showInfo() {
        System.out.println("Name is: " + name + ", Age is: " + age);
    }
}
 
public class classAndObject {
    public static void main(String[] args) {
        Student s = new Student();

        s.name = "sifat";
        s.age = 14;

        s.showInfo(); 
    }
}
