class Animal{
    public void MakeSound(){
        System.out.println("GEoGeoGeo");
    }
}

class Dog extends Animal{
    @Override
    public void MakeSound(){
        System.out.println("Huka hua");
    }
}

public class overRiding{
    public static void main(String[] args) {
        Dog obj = new Dog();
        obj.MakeSound();
    }
}