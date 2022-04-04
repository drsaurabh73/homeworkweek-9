import java.util.ArrayList;
import java.util.Scanner;

public class Programme6 {

    public static void main(String[] args) {
int a [] = new int [7];
        ArrayList<String> fruitName = new ArrayList<>();

        fruitName.add("Apple");
        fruitName.add("Banana");
        fruitName.add("Mango");
        fruitName.add("Strawberry");
        fruitName.add("Blueberry");
        fruitName.add("Blackberry");
        fruitName.add("Mellon");
        System.out.println(fruitName);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the index number: ");
        int index = scanner.nextInt();
        System.out.println(fruitName.get(index));
    }
}
