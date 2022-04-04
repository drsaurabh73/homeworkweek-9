package calculate;

import java.util.Locale;
import java.util.Scanner;

public class Main extends Calculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String answer;
do {
    System.out.println("Enter the First Number");
    int a = scanner.nextInt();
    System.out.println("Enter the Second Number");
    int b = scanner.nextInt();
    System.out.println("Enter the Given operation +,-,*,/");
    char symbol = scanner.next().charAt(0);
    Calculator obj = new Calculator();
    obj.calculateResult(a, b, symbol);
    System.out.println("Would you like to do more operation 'Y' or 'N' : ");
    answer = scanner.next().toLowerCase(Locale.ROOT);

} while (answer.startsWith("Y"));
scanner.close();
    }
}
