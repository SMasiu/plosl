import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Locale.setDefault(new Locale("pl", "PL"));

        System.out.print("Podaj r: ");
        double r = scanner.nextDouble();

        if(r <= 0) {
            System.out.print("Podano niepoprawny promień");
            System.exit(1);
        }

        System.out.print("Podaj h: ");
        double h = scanner.nextDouble();

        if(h <= 0) {
            System.out.print("Podano niepoprawną wysokość");
            System.exit(1);
        }

        double pb = 2 * Math.PI * r * h;
        double pp = Math.PI * Math.pow(r, 2);
        double v = pp * h;

        System.out.printf("Pole powierzchni bocznej walca wynosi: %f\n", pb);
        System.out.printf("Objętość walca wynosi: %f\n", v);

    }
}