package lista06_vetctorsAndListsAndMatrix.applications;

import java.util.Scanner;


/*
    Faça um programa que leia um número inteiro positivo N (máximo = 10)
    e depois N números inteiros e armazene-os em um vetor.
    Em seguida, mostrar na tela todos os números negativos lidos.
 */
public class ex03_MainNegativos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");
        int n = scanner.nextInt();

        int [] vetor = new int[n];

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite um número: ");
            vetor[i] = scanner.nextInt();
        }

        System.out.println("NÚMEROS NEGATIVOS: ");
        for (int j : vetor) {
            if (j < 0) {
                System.out.println(j);
            }
        }

        scanner.close();
    }
}
