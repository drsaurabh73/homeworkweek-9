import java.util.ArrayList;

public class Programme7 {

    public static void main(String[] args) {

        ArrayList<String> undergroundTube = new ArrayList<>();
        undergroundTube.add("Central");
        undergroundTube.add("Metropolitan");
        undergroundTube.add("Northern");
        undergroundTube.add("Bakerloo");
        undergroundTube.add("Jubilee");
        undergroundTube.add("Distract");
        undergroundTube.add("Piccadilly");
        undergroundTube.add("DLR");
        System.out.println("Given Array list:"  + undergroundTube);

        if(undergroundTube.isEmpty()) {
            System.out.println("Given Array List is Empty");
        } else {
            System.out.println("Given Array List is not Empty");

        }

    }
 }
