package ee.ivkhkdev;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class JPTV23Task2MilanaKrainjaja {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите трёхзначное число: ");
        int number = scanner.nextInt();
        int u = number % 10;
        int t = (number / 10) % 10;
        int h = number / 100;
        int sumofdigits = h + t + u;
        System.out.println("Число единиц: " + u);
        System.out.println("Число десятков: " + t);
        System.out.println("Сумма цифр: " + sumofdigits);
    }
}