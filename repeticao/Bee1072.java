import java.util.Scanner;

public class Bee1072 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        int out = 0;
        int in = 0;
        int X;

        for(int i=0; i<N; i++) {
            X = input.nextInt();
            if (X >= 10 && X <= 20) {
                in += 1;
            } else {
                out += 1;
            }
        }

            System.out.println(in + " in");
            System.out.println(out + " out");

            input.close();
        }
    }
