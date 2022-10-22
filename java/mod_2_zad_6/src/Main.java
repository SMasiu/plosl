import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Locale.setDefault(new Locale("pl", "PL"));

        double[][] matrix = {
            {0, 0, 0},
            {0, 0, 0},
            {0, 0, 0},
        };

        for(int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 2; j++) {
                System.out.printf("Podaj a%s%s: ", i + 1, j + 1);
                matrix[i][j] = scanner.nextDouble();
            }
        }

        System.out.print("Podaj b1: ");
        double b1 = scanner.nextDouble();

        System.out.print("Podaj b2: ");
        double b2 = scanner.nextDouble();

        System.out.print("Podaj b3: ");
        double b3 = scanner.nextDouble();

        double w = Main.calculateDeterminant3x3(matrix);

        double[][] matrix_x = {
            matrix[0].clone(),
            matrix[1].clone(),
            matrix[2].clone(),
        } ;

        matrix_x[0][0] = b1;
        matrix_x[1][0] = b2;
        matrix_x[2][0] = b3;

        double wx = Main.calculateDeterminant3x3(matrix_x);

        double[][] matrix_y = {
            matrix[0].clone(),
            matrix[1].clone(),
            matrix[2].clone(),
        };

        matrix_y[0][1] = b1;
        matrix_y[1][1] = b2;
        matrix_y[2][1] = b3;

        double wy = Main.calculateDeterminant3x3(matrix_y);

        double[][] matrix_z = {
            matrix[0].clone(),
            matrix[1].clone(),
            matrix[2].clone(),
        };

        matrix_z[0][2] = b1;
        matrix_z[1][2] = b2;
        matrix_z[2][2] = b3;

        double wz = Main.calculateDeterminant3x3(matrix_z);

        if(w == 0) {
            System.out.print("Układ sprzeczny");
        } else {
            double x1 = wx / w;
            double x2 = wy / w;
            double x3 = wz / w;

            System.out.printf("x1 = %f x2 = %f x3 = %f", x1, x2, x3);
        }
    }

    public static double calculateDeterminant3x3(double tab[][]) {
        double determinant_1 = (tab[0][0] * tab[1][1] * tab[2][2]) + (tab[1][0] * tab[2][1] * tab[0][2]) + (tab[2][0] * tab[0][1] * tab[1][2]);
        double determinant_2 = (tab[0][2] * tab[1][1] * tab[2][0]) + (tab[1][2] * tab[2][1] * tab[0][0]) + (tab[2][2] * tab[0][1] * tab[1][0]);

        return determinant_1 - determinant_2;

    }
}