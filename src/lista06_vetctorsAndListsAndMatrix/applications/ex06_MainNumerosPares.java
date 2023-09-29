package lista06_vetctorsAndListsAndMatrix.applications;

import java.util.Scanner;

/*
Faça um programa que leia N números inteiros e armazene-os em um vetor.
Em seguida, mostre na tela todos os números pares, e também a quantidade de números pares.
 */

public class ex06_MainNumerosPares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos números tu vais querer digitar? ");
        int n = scanner.nextInt();

        int[] vetor = new int[n];

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite um número: ");
            vetor[i] = scanner.nextInt();
        }

        int soma = 0;
        System.out.println("NÚMEROS PARES:");
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 == 0) {
                System.out.print(vetor[i] + "  ");
                soma++;
            }
        }

        System.out.println();
        System.out.print("QUANTIDADE DE NÚMEROS PARES = " + soma);

        scanner.close();
    }
}
