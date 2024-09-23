package ee.ivkhkdev;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class JPTV23Task3MlanaKrainjaja {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print("Введите имя пользователя: ");
        String yourname = scanner.nextLine();
        System.out.print("Введите фамилию: ");
        String yoursurname = scanner.nextLine();
        System.out.print("Введите ваш личный код: ");
        String id = scanner.nextLine();
        System.out.println(yourname + " " + yoursurname);
        String year = id.substring(1,3);
        String cent = id.substring(0);
        if (cent.contains("4") || cent.contains("3")) {
            System.out.println("Год рождения: 19" + year + " год");
        }
        if (cent.contains("5") || cent.contains("6")) {
            System.out.println("Год рождения: 20" + year + " год");
        }

        String month = id.substring(4,5);
        System.out.print("Месяц: "+month+", ");
        String day = id.substring(5,7);
        System.out.println("День: "+day);

    }
}