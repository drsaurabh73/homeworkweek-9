import java.util.HashSet;
import java.util.Set;

public class Programme8 {

    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();
        set.add(4);
        set.add(7);
        set.add(8);
        System.out.println(set);
        for (int i = 1; i <= 10; i++) {
            if (set.contains(i)) {
                System.out.println( i+ " Number is in the set");
                        }else {
                System.out.println(" Number is not in the Set");
            }

        }
    }
}