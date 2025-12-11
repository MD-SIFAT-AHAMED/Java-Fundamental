
enum Laptops {
    mac(1823), thinkPad(384), dell;

    private int price;

    private Laptops() {
        price = 500;
    }

    private Laptops(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}

public class enumAdvance {

    public static void main(String[] args) {
        Laptops s = Laptops.dell;
        System.err.println(s + ":" + s.getPrice());
    }
}
