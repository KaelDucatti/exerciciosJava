package lista06_vetctorsAndListsAndMatrix.applications;

import java.util.Scanner;


/*
Faça um programa que leia N números reais e armazene-os em um vetor.
Em seguida: - Imprimir todos os elementos do vetor - Mostrar na tela a soma e a média dos elementos do vetor
 */
public class ex04_MainSomaVetor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");
        int n = scanner.nextInt();

        double[] vetor = new double[n];

        double soma = 0;
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite um número: ");
            vetor[i] = scanner.nextDouble();
            soma += vetor[i];
        }

        System.out.println();
        System.out.print("VALORES = ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("%.2f  ", vetor[i]);
        }

        System.out.println();
        System.out.printf("SOMA = %.2f%n", soma);
        System.out.printf("MÉDIA = %.2f%n", soma/vetor.length);

        scanner.close();
    }
}
