package calculator;

public class Calculator {

    public int divide(int a, int b) {
        if (b == 0){
            throw new IllegalArgumentException("Cannot divide by zero!!!");
        }
        return a / b;
    }

    static void main() {
        Calculator calculator = new Calculator();
        try {
            System.out.println(calculator.divide(10, 0));
        } catch (Exception e) {
            // Deal with the exception
            System.out.println(e);
            System.out.println("Division by zero detected.");

        }
    }
}
