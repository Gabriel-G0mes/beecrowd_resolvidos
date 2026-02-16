import java.util.Locale;
import java.util.Scanner;

public class Bee1017 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        int tempoGasto = input.nextInt();
        int mediaKm = input.nextInt();
        double mediaLitros =  (double) (tempoGasto * mediaKm) / 12;

        System.out.printf("%.3f%n", mediaLitros);

        input.close();
    }
}
