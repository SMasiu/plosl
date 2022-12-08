import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("pl", "PL"));
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj tekst: ");
        String input = scanner.nextLine();

        int count = 0;

        for (int i = 0; i < input.length() - 1; i++) {
            if (input.charAt(i) == 'a' && input.charAt(i + 1) == 'b') {
                count++;
            }
        }

        System.out.println("The pattern 'ab' appeared " + count + " times.");
    }
}
