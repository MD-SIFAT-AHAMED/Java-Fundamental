
import java.util.HashMap;
import java.util.Map;

public class javaMap {

    public static void main(String[] args) {
        Map<String, Integer> student = new HashMap<>();
        student.put("sifat", 10);
        student.put("sifat2", 010);
        student.put("sifat4", 110);

        System.out.println(student);
    }
}
