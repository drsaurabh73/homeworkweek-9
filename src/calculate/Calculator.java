package calculate;

public class Calculator {

    public void addition(int a, int b) {
        System.out.println(a+b);
    }
    public void substraction(int a, int b) {
        System.out.println(a-b);
    }
    public void multiplication(int a, int b) {
        System.out.println(a*b);
    }

    public void division(int a,int b) {
        System.out.println(a/b);

    }
    public void calculateResult(int a, int b, char symbol) {
        if( symbol == '+') {
            addition(a,b);
        } else if (symbol == '-') {
            substraction(a, b);
        } else if (symbol == '*') {
            multiplication(a, b);
        } else if( symbol == '/') {
            division(a, b);
        } else {
            System.out.println("Invalid operation");
        }

    }
}
