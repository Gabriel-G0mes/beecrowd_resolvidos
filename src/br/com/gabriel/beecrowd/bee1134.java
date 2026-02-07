package br.com.gabriel.beecrowd;
import java.util.Scanner;

public class bee1134 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int type = input.nextInt();
        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        while (type != 4) {
            if (type == 1) {
                alcool += 1;
            }
            else if (type == 2) {
                gasolina += 1;
            }
            else if (type == 3) {
                diesel += 1;
            }

            type = input.nextInt();
        }

        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);

        input.close();
    }
}
