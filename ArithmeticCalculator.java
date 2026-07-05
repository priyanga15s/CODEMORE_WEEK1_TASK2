import java.util.Scanner;

public class ArithmeticCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter the first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = sc.nextDouble();

       
        System.out.print("Enter operation (+, -, *, /): ");
        char operation = sc.next().charAt(0);

        
        switch (operation) {
            case '+':
                System.out.println("Result = " + (num1 + num2));
                break;

            case '-':
                System.out.println("Result = " + (num1 - num2));
                break;

            case '*':
                System.out.println("Result = " + (num1 * num2));
                break;

            case '/':
                if (num2 == 0) {
                    System.out.println("Error: Division by zero is not allowed.");
                } else {
                    System.out.println("Result = " + (num1 / num2));
                }
                break;

            default:
                System.out.println("Invalid operation! Please enter +, -, *, or /.");
        }

        sc.close();
    }
}