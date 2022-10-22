import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("pl", "PL"));
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj promień koła: ");
        double r = scanner.nextDouble();

        System.out.printf("Powierzchnia koła: %f", Math.PI * r * r);
    }
}