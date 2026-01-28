import java.util.Scanner;
import java.util.Locale;

public class exer1009{
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		String nome;
		double salarioFixo, totalVendas, pagamento;

		nome = sc.next();
		salarioFixo = sc.nextDouble();
		totalVendas = sc.nextDouble();
		
		pagamento = salarioFixo + (totalVendas * 0.15);

		System.out.printf("TOTAL = R$ %.2f", pagamento);
		
		sc.close();
	}
}
