import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Locale.setDefault(new Locale("pl", "PL"));

        System.out.print("Podaj r: ");
        double r = scanner.nextDouble();

        System.out.print("Podaj h: ");
        double h = scanner.nextDouble();

        double pb = 2 * Math.PI * r * h;
        double pp = Math.PI * Math.pow(r, 2);
        double v = pp * h;

        System.out.printf("Pole powierzchni bocznej walca wynosi: %f\n", pb);
        System.out.printf("Objętość walca wynosi: %f\n", v);

    }
}