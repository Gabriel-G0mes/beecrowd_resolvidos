import java.util.Locale;
import java.util.Scanner;

public class Bee1014 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int X;
		double Y, ConsumoMedioKm;
		
		X = sc.nextInt();
		Y = sc.nextDouble();
		
		ConsumoMedioKm = X / Y;
		
		System.out.printf("%.3f km/l%n", ConsumoMedioKm);
		
		sc.close();
	}
}
