import java.util.Scanner;

public class Bee1153_V2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        int resultado = 1;
        int numero = 1;

        while (numero <= N) {
            resultado *= numero;
            numero += 1;
        };

        System.out.println(resultado);

        input.close();
    }
}

