import java.util.ArrayList;

public class Programme4 {
    int a[] = new int[7];

    public static void main(String[] args) {

        ArrayList<String> colourName = new ArrayList<>();
        colourName.add("Red");
        colourName.add("Blue");
        colourName.add("Pink");
        colourName.add("Yellow");
        colourName.add("White");
        colourName.add("Black");
        colourName.add("Green");

       // for (int i = 0; i < colourName.size(); i++) {
            //System.out.println(colourName.get(i));
            for (String data : colourName) {
                System.out.println(data);
            }


        }
    }

