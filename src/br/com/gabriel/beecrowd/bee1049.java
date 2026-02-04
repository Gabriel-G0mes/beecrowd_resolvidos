package br.com.gabriel.beecrowd;
import java.util.Scanner;

public class bee1049 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String fase1 = input.nextLine();
        String fase2 = input.nextLine();
        String fase3 = input.nextLine();
        String animal = "";

        if (fase1.equals("vertebrado") && fase2.equals("ave") && fase3.equals("carnivoro")) {
            animal = "aguia";
        }

        if (fase1.equals("vertebrado") && fase2.equals("ave") && fase3.equals("onivoro")) {
            animal = "pomba";
        }

        if (fase1.equals("vertebrado") && fase2.equals("mamifero") && fase3.equals("onivoro")) {
            animal = "homem";
        }

        if (fase1.equals("vertebrado") && fase2.equals("mamifero") && fase3.equals("herbivoro")) {
            animal = "vaca";
        }

        if (fase1.equals("invertebrado") && fase2.equals("inseto") && fase3.equals("hematofago")) {
            animal = "pulga";
        }

        if (fase1.equals("invertebrado") && fase2.equals("inseto") && fase3.equals("herbivoro")) {
            animal = "lagarta";
        }

        if (fase1.equals("invertebrado") && fase2.equals("anelideo") && fase3.equals("hematofago")) {
            animal = "sanguessuga";
        }

        if (fase1.equals("invertebrado") && fase2.equals("anelideo") && fase3.equals("onivoro")) {
            animal = "minhoca";
        }

        System.out.println(animal);

        input.close();
    }
}
