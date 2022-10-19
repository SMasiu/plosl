import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Locale.setDefault(new Locale("pl", "PL"));

        System.out.print("Podaj x: ");
        double x = scanner.nextDouble();

        System.out.print("Podaj y: ");
        double y = scanner.nextDouble();

        System.out.printf("Wynik dodawania: %s\n", x + y);

        System.out.printf("Wynik odejmowania: %s\n", x - y);

        System.out.printf("Wynik mnożenia: %s\n", x * y);

        if(y == 0) {
            System.out.println("Nie można dzielić przez 0");
        } else {
            System.out.printf("Wynik dzielenia: %s\n", x / y);
        }
    }
}