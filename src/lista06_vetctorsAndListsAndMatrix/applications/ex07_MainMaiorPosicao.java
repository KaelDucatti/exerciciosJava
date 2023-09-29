package lista06_vetctorsAndListsAndMatrix.applications;

import java.util.Scanner;

public class ex07_MainMaiorPosicao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos números tu vais digitar? ");
        int n = scanner.nextInt();

        double[] vetor = new double[n];

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite um número: ");
            vetor[i] = scanner.nextDouble();
        }

        double maior = 0;
        int posicao = 0;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
                posicao = i;
            }
        }

        System.out.printf("MAIOR VALOR = %.2f%n", maior);
        System.out.printf("POSICAO DO MAIOR VALOR = %d%n", posicao);

        scanner.close();
    }
}
