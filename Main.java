import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String nome;
		double salarioFixo, totalVendas, pagamento;

		nome = sc.next();
		salarioFixo = sc.nextDouble();
		totalVendas = sc.nextDouble();

		pagamento = salarioFixo + (totalVendas * 0.15);

		System.out.println("TOTAL = R$ ", pagamento);
	}
}