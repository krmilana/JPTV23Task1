package ee.ivkhkdev;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Введите температуру в градусах Целисия: ");
        double celsius = scanner.nextDouble();
        double fahrenheit = (celsius * 9/5) + 32;
        System.out.printf("Температура в градусах Фаренгейта: " + fahrenheit);
    }
}
