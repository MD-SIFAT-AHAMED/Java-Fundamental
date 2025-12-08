
abstract class Car {

    public abstract void drive();

    public abstract void playMusic();

    public void geName() {
        System.out.println("My name is Sifat");

    }
}

abstract class Toyota extends Car {

    // jemon ei khane skip krolam Drive. tar jonne conrete class crete korte hobe
    @Override
    public void playMusic() {
        System.out.println("Playing ....");
    }
}

class UpdatedToyota extends Toyota { // Concrete class

    public void drive() {
        System.out.println("Driving...");
    }

}

public class abstractMethod {

    public static void main(String[] args) {
        Car obj = new UpdatedToyota();
        obj.drive();
        obj.playMusic();
        obj.geName();
    }
}
