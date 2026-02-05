package br.com.gabriel.beecrowd;
import java.util.Locale;
import java.util.Scanner;

public class bee1048 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        double salary = input.nextDouble();
        double percentage;

        if (salary <= 400.00) {
            percentage = 0.15;
        }
        else if (salary <= 800.00) {
            percentage = 0.12;
        }
        else if (salary <= 1200.00) {
            percentage = 0.10;
        }
        else if (salary <= 2000.00) {
            percentage = 0.07;
        }
        else {
            percentage = 0.04;
        }

        double newSalary = salary + (salary * percentage);
        double readjustment =  newSalary - salary;
        percentage = percentage * 100;

        System.out.printf("Novo salario: %.2f%n", newSalary);
        System.out.printf("Reajuste ganho: %.2f%n", readjustment);
        System.out.printf("Em percentual: %.0f %%%n", percentage);

        input.close();
    }
}
