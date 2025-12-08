
public class stringBuffer {

    public static void main(String[] args) {

        // String immutable exmple
        String s = "hello";
        System.out.println(s);
        s = s + "world";
        System.out.println(s);

        // StringBUffert Mutrable string exmple

        StringBuffer sb = new StringBuffer("SIFAT");
        sb.append(" AHAMED");
        sb.insert(6, "New World ");
        System.out.println(sb);
    }
}
