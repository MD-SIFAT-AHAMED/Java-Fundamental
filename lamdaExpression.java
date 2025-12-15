
interface Cal {

    int add(int a, int b);
}

public class lamdaExpression {

    public static void main(String[] args) {
        // Regular expression / Anonymous class

        // Cal miya = new Cal() {
        //     public int add(int a, int b) {
        //         return a + b;
        //     }
        // };
        //Lamda expression
        Cal miya = (a, b) -> a + b;

        int value = miya.add(10, 20);
        System.out.println(value);
    }
}
