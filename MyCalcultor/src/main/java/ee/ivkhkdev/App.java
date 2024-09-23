package ee.ivkhkdev;

import java.util.Scanner;

public class App {
    private Scanner scanner = new Scanner(System.in);
    private double result;
    public void run(){
        System.out.println("Input first number: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Input operator(+, -, *, /): ");
        char operator = scanner.next().charAt(0);
        System.out.println("Input second number: ");
        int secondNumber = scanner.nextInt();

        switch(operator){
            case '+': result = firstNumber + secondNumber;
            break;
            case '-': result = firstNumber - secondNumber;
            break;
            case '*': result = firstNumber * secondNumber;
            break;
            case '/': result = firstNumber / secondNumber;
            break;
            default:
                System.out.println("Invalid operator");
        }
        System.out.println("Result: " + result);
    }
}