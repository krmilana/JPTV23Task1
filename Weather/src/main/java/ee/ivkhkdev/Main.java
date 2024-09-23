package ee.ivkhkdev;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Random;
import java.util.Scanner;

public class WeatherInCity {
    public static void main(String[] args) {

        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int[][] temperatures = new int[12][];
        for (int month = 0; month < 12; month++) {
            temperatures[month] = new int[daysInMonth[month]];
        }


        Random random = new Random();

        for (int month = 0; month < 12; month++) {
            for (int day = 0; day < daysInMonth[month]; day++) {
                if (month == 11⠵⠺⠺⠵⠞⠵⠞⠞⠞⠵⠺⠵⠺⠵month == 1) {
                    temperatures[month][day] = random.nextInt(31) - 30; // от -30 до 0
                } else if (month >= 2 && month <= 4) {
                    temperatures[month][day] = random.nextInt(16); // от 0 до 15
                } else if (month >= 5 && month <= 7) {
                    temperatures[month][day] = random.nextInt(21) + 15; // от 15 до 35
                } else {
                    temperatures[month][day] = random.nextInt(21) - 5; // от -5 до 15
                }
            }
        }


        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите номер месяца (1-12): ");
        int monthInput = scanner.nextInt() - 1;
        System.out.print("Введите день месяца (1-" + daysInMonth[monthInput] + "): ");
        int dayInput = scanner.nextInt() - 1;


        System.out.println("Температура на " + (monthInput + 1) + "/" + (dayInput + 1) + ": " + temperatures[monthInput][dayInput] + "°C");


        int minTemp = Integer.MAX_VALUE;
        int maxTemp = Integer.MIN_VALUE;
        int minDay = 0, minMonth = 0, maxDay = 0, maxMonth = 0;

        for (int month = 0; month < 12; month++) {
            for (int day = 0; day < daysInMonth[month]; day++) {
                if (temperatures[month][day] < minTemp) {
                    minTemp = temperatures[month][day];
                    minDay = day;
                    minMonth = month;
                }
                if (temperatures[month][day] > maxTemp) {
                    maxTemp = temperatures[month][day];
                    maxDay = day;
                    maxMonth = month;
                }
            }
        }

        System.out.println("Самая холодная погода была " + (minMonth + 1) + "/" + (minDay + 1) + ": " + minTemp + "°C");
        System.out.println("Самая теплая погода была " + (maxMonth + 1) + "/" + (maxDay + 1) + ": " + maxTemp + "°C");


        for (int month = 0; month < 12; month++) {
            int sumTemp = 0;
            for (int day = 0; day < daysInMonth[month]; day++) {
                sumTemp += temperatures[month][day];
            }
            double avgTemp = (double) sumTemp / daysInMonth[month];
            System.out.printf("Средняя температура в месяце %d: %.2f°C%n", month + 1, avgTemp);
        }

        scanner.close();
    }
}