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

        System.out.print("Podaj c: ");
        double c = scanner.nextDouble();

        if(a == 0) {
            System.out.println("a nie może być równe 0");
        }

        double delta = Math.pow(b, 2) - (4 * a * c);

        if(delta < 0) {
            System.out.println("Równanie nie ma rozwiązań");
        } else {
            double x1 = ((b * -1) - Math.sqrt(delta)) / (2 * a);
            double x2 = ((b * -1) + Math.sqrt(delta)) / (2 * a);

            System.out.printf("x1 = %f x2 = %f", x1, x2);
        }
    }
}