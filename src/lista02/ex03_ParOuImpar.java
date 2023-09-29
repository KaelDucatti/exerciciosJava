package lista02;

import java.util.Scanner;

// Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.
public class ex03_ParOuImpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero;

        System.out.print("O número ");
        numero = sc.nextInt();

        if (numero % 2 == 0){
            System.out.println("é par");
        }
        else {
            System.out.println("é ímpar");
        }

        sc.close();
    }
}
