
enum Status {
    Running, Pending, Success, Failed
}

public class enumJava {

    public static void main(String[] args) {
        Status payment = Status.Running;
        System.out.println(payment);

        Status[] pay = Status.values();

        for (Status s : pay) {
            System.out.println(s + " :" + s.ordinal());
        }

        if (payment == payment.Success) {
            System.out.println("Ok Thanks");

        } else if (payment == payment.Failed) {
            System.out.println("no thanks");
        }

        Status option = Status.Pending;

        switch (option) {
            case Running:
                System.out.println(" Payment Running");
                break;

            case Pending:
                System.out.println("payment pending");
                break;
            default:
                System.out.println("Payment Done");
                break;
        }
    }
}
