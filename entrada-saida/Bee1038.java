import java.util.Locale;
import java.util.Scanner;

public class Bee1038 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int code;
        int  quant;
        double valorProduto, totalPagar;

        code = sc.nextInt();
        quant = sc.nextInt();

        switch (code) {
            case 1:
                valorProduto = 4.00;
                break;
            case 2:
                valorProduto = 4.50;
                break;
            case 3:
                valorProduto = 5.00;
                break;
            case 4:
                valorProduto = 2.00;
                break;
            case 5:
                valorProduto = 1.50;
                break;
            default:
                valorProduto = 0;
        }

        totalPagar = valorProduto * quant;

        System.out.printf("Total: R$ %.2f\n", totalPagar);

    sc.close();
    }
}
