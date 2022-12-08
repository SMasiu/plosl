import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("pl", "PL"));
        Scanner input = new Scanner(System.in);

        System.out.print("Podaj tekst: ");

        String text = input.nextLine();

        String[] words = text.split(" ");

        for (String word : words) {
            System.out.println(word);
        }
    }
}
