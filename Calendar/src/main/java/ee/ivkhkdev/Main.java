package ee.ivkhkdev;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class EasternCalendar {
    public static void main(String[] args) {
        String[] colors = {"Зеленый", "Красный", "Желтый", "Белый", "Черный"};
        String[] animals = {"Крыса", "Корова", "Тигр", "Заяц", "Дракон", "Змея", "Лошадь",
                "Овца", "Обезьяна", "Курица", "Собака", "Свинья"};


        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите год: ");
        int year = scanner.nextInt();

        int cycleYear = (year - 1984) % 60;
        if (cycleYear < 0) {
            cycleYear += 60;
        }

        String color = colors[(cycleYear / 12) % 5];


        String animal = animals[cycleYear % 12];

        System.out.println("Год " + color + " " + animal);
    }
}