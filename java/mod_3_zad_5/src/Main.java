import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("pl", "PL"));
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj tekst: ");

        String text = scanner.nextLine();

        String[] words = text.split(" ");

        System.out.println("Liczba słów: " + words.length);
    }
}