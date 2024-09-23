package ee.ivkhkdev;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Random;
import java.util.Scanner;

public class MultiplicationTest {


    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int correctAnswers = 0;

        for (int i = 0; i < 5; i++) {
            int num1 = random.nextInt(9) + 1;
            int num2 = random.nextInt(9) + 1;


            System.out.print("Сколько будет " + num1 + " * " + num2 + "? ");
            int userAnswer = scanner.nextInt();

            if (userAnswer == num1 * num2) {
                System.out.println(ANSI_GREEN + "Правильно!" + ANSI_RESET);
                correctAnswers++;
            } else {
                System.out.println(ANSI_RED + "Ошибка! Правильный ответ: " + (num1 * num2) + ANSI_RESET);
            }
        }

        System.out.println("\nВаш результат: " + correctAnswers + "/5 правильных ответов.");

        if (correctAnswers == 5) {
            System.out.println(ANSI_GREEN + "Молодец!" + ANSI_RESET);
        } else if (correctAnswers >= 3) {
            System.out.println(ANSI_GREEN + "Надо бы еще поучить." + ANSI_RESET);
        } else {
            System.out.println(ANSI_RED + "Срочно нужно учить таблицу умножения." + ANSI_RESET);
        }

        scanner.close();
    }
}