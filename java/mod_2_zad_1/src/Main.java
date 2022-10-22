import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Locale.setDefault(new Locale("pl", "PL"));

        System.out.print("Podaj a: ");
        double a = scanner.nextDouble();

        System.out.print("Podaj b: ");
        double b = scanner.nextDouble();

        System.out.printf("%f + %f = %f\n", a, b, a + b);

        if(b == 0) {
            System.out.println("Nie dzielimy przez 0");
        } else {
            System.out.printf("%f / %f = %f\n", a, b, a / b);
        }

        System.out.println("Hello world!");
    }
}