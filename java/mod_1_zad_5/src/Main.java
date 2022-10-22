import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("pl", "PL"));
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj stopnie: ");
        double deg = scanner.nextDouble();
        double rad = deg * Math.PI / 180;

        System.out.printf("%f stopni to %f radionów", deg, rad);
    }
}