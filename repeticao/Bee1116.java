import java.util.Scanner;

public class Bee1116 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        int X, Y;

        for (int i=0; i<N; i++) {
            X = input.nextInt();
            Y = input.nextInt();

            if(Y == 0) {
                System.out.println("divisao impossivel");
            }
            else {
                double division = (double) X / Y;
                System.out.printf("%.1f%n", division);
            }
        }
    }
}
