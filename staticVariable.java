
class Mobile {

    static String Name;
    int price;

    void showInfo() {
        System.out.println("Mobile Name: " + Name + " price is: " + price);
    }
}

public class staticVariable {

    public static void main(String[] args) {
        Mobile obj1 = new Mobile();
        Mobile obj2 = new Mobile();

        obj1.Name = "Oppo";
        obj1.price = 189999;

        obj2.Name = "Samsung";
        obj2.price = 8349;

        Mobile.Name = "MD SIFAT AHAMED"; // all name field change

        obj1.showInfo();
        obj2.showInfo();

    }
}
