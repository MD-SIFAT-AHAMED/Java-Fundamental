
class Mobile {
    // static String name;
    // static int price;
     String name;
     int price;


    // static void add() {
    //     System.out.println("Mobile Name: " + name + " price is: " + price);
    // }
    static void add(Mobile obj) {
        System.out.println("Mobile Name: " + obj.name + " price is: " + obj.price);
    }
}

public class staticMethod {

    public static void main(String[] args) {
        
        Mobile obj = new Mobile();
        obj.name = "ehllo";
        obj.price = 182;
        // obj.add();
       
       Mobile.add(obj);
    }
}
