import java.util.Locale;
import java.util.Scanner;

public class Bee1010 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int peca1, peca2, quantidade1, quantidade2;
		double preco1, preco2, total;
		
		peca1 = sc.nextInt();
		quantidade1 = sc.nextInt();
		preco1 = sc.nextDouble();
		
		peca2 = sc.nextInt();
		quantidade2 = sc.nextInt();
		preco2 = sc.nextDouble();
		
		total = (quantidade1 * preco1) + (quantidade2 * preco2);
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);

		sc.close();
	}
}
