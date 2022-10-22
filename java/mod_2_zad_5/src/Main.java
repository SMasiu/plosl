import java.util.Locale;
import java.util.Scanner;

// [a11 = a_x1_y1, a12 = a_x2_y1]
// [a21 = a_x1_y2, a22 = a_x2_y2]

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Locale.setDefault(new Locale("pl", "PL"));

        System.out.print("Podaj a11: ");
        double a_x1_y1 = scanner.nextDouble();

        System.out.print("Podaj a12: ");
        double a_x2_y1 = scanner.nextDouble();

        System.out.print("Podaj a21: ");
        double a_x1_y2 = scanner.nextDouble();

        System.out.print("Podaj a22: ");
        double a_x2_y2 = scanner.nextDouble();

        System.out.print("Podaj b1: ");
        double b1 = scanner.nextDouble();

        System.out.print("Podaj b2: ");
        double b2 = scanner.nextDouble();

        double w = (a_x1_y1 * a_x2_y2) - (a_x1_y2 * a_x2_y1);
        double wx = (b1 * a_x2_y2) - (b2 * a_x2_y1);
        double wy = (a_x1_y1 * b2) - (a_x1_y2 * b1);

        if(w == 0) {
            System.out.print("Układ sprzeczny");
        } else {
            double x1 = wx / w;
            double x2 = wy / w;

            System.out.printf("x1 = %f x2 = %f", x1, x2);
        }
    }
}