import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Locale.setDefault(new Locale("pl", "PL"));

        System.out.print("Podaj a: ");
        double a = scanner.nextDouble();

        if(a == 0) {
            System.out.println("a nie może być równe 0");
            System.exit(1);
        }

        System.out.print("Podaj b: ");
        double b = scanner.nextDouble();

        System.out.print("Podaj y: ");
        double y = scanner.nextDouble();

        double x = (y - b) / a;

        System.out.printf("x = %f", x);
    }
}