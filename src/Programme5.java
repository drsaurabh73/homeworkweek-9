import java.util.ArrayList;
import java.util.Iterator;

public class Programme5 {

    public static void main(String[] args) {

        ArrayList<String> colourName = new ArrayList<>();
        colourName.add("Red");
        colourName.add("Blue");
        colourName.add("Pink");
        colourName.add("Yellow");
        colourName.add("White");
        colourName.add("Black");
        colourName.add("Green");

        Iterator<String> itr =colourName.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
