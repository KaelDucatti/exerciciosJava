package lista01;

import java.util.Scanner;

public class ex01_SomaDoisValores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, soma;

        System.out.println("Primeiro número: ");
        a = sc.nextInt();
        System.out.println("Segundo número");
        b = sc.nextInt();

        soma = a + b;

        System.out.println("Resultado: " + soma);

        sc.close();
    }
}
