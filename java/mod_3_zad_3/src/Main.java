import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("pl", "PL"));
        Scanner scanner = new Scanner(System.in);

        System.out.print("Wpisz tekst: ");

        String input = scanner.nextLine();

        for (int i = 0; i < input.length(); i++) {
            System.out.print(input.charAt(i) + " ");
        }

        scanner.close();
    }
}