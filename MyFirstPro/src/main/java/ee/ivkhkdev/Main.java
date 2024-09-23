package ee.ivkhkdev;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static int numberInt = 2768;
    static short numberShort = 32767;
    static short numberShort2;
    public static void main(String[] args) {
        numberShort2 = (short) (numberInt + 10000);
        System.out.println("numberShort2 = " + numberShort2);
        App app = new App();
        System.out.println("app.myString = " + app.getMyString());
    }
}