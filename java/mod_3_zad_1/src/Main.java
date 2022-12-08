import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("pl", "PL"));
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Wpisz jakiś tekst (albo 'quit' żeby wyjść):");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("quit")) {
                break;
            }
        }

        System.out.println("Koniec!");
    }
}