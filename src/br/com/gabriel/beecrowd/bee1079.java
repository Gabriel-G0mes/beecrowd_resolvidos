package br.com.gabriel.beecrowd;
import java.util.Locale;
import java.util.Scanner;

public class bee1079 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        double a, b, c;

        for (int i=0; i<N; i++) {
            a = input.nextDouble();
            b = input.nextDouble();
            c = input.nextDouble();

            a = a * 2;
            b = b * 3;
            c = c * 5;

            double soma = a + b + c;
            double media = soma / 10;

            System.out.printf("%.1f%n", media);
        }

        input.close();
    }
}
