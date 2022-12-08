import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("pl", "PL"));
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj tekst: ");

        String input = scanner.nextLine();
        String output = input.trim();

        System.out.println("Tekst: " + output);
    }
}