import java.util.HashMap;
import java.util.Map;

public class Programme9 {

    public static void main(String[] args) {
        Map<Integer, String> peopleName = new HashMap<>();

        peopleName.put(1, "Kalpesh");
        peopleName.put(2, "Purvi");
        peopleName.put(3, "Vrunda");
        peopleName.put(4, "Shruti");
        peopleName.put(5, "Harsh");
        peopleName.put(6, "Surbhi");

        for (Map.Entry<Integer, String> peopleName1 : peopleName.entrySet()) {
            System.out.println(peopleName1.getKey() +peopleName1.toString());

        }
    }
}