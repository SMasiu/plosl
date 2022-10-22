import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Locale.setDefault(new Locale("pl", "PL"));

        double a = 5;
        double b = 3;
        double c = 8;
        double d = 6;

        System.out.print("Podaj x: ");
        double x = scanner.nextDouble();

        double ax = a * Math.pow(x, 2) + b * x + c;
        double bx = a * Math.pow(x, 3) + b * Math.pow(x, 2) + c * x + d;

        System.out.printf("A(x) = ax^2 + bx + c gdzie: a = %f b = %f c = %f x = %f wynosi: %f\n", a, b, c, x, ax);
        System.out.printf("B(x) = ax^3 + bx^2 + cx + d gdzie: a = %f b = %f c = %f d = %f x = %f wynosi: %f\n", a, b, c, d, x, bx);

    }
}