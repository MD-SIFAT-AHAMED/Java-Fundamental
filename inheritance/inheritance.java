
public class inheritance {

    public static void main(String[] args) {
        AdvCalc obj = new AdvCalc();
        int r1 = obj.add(10, 20);
        int r2 = obj.sub(10, 20);
        int r3 = obj.mul(10, 20);
        double r4 = obj.div(10, 20);
        System.out.println(r1 + " " + r2 + " " + r3 + " " + r4);
    }
}
