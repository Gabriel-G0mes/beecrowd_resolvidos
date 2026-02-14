package br.com.gabriel.beecrowd;
import java.util.Scanner;

public class bee1153 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        int resultado = 1;


        if(N == 0) {
            System.out.println(resultado);
        }
        else {
            for (int i=1; i <= N; i++) {
                resultado *= i;
            }
        }

        System.out.println(resultado);

        input.close();
    }
}

