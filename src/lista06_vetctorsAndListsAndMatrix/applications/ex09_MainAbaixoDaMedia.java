package lista06_vetctorsAndListsAndMatrix.applications;

import java.util.Scanner;

/*
Fazer um programa para ler um número inteiro N e depois um vetor de N números reais. Em seguida,
mostrar na tela a média aritmética de todos elementos com três casas decimais. Depois mostrar todos
os elementos do vetor que estejam abaixo da média, com uma casa decimal cada.
 */

public class ex09_MainAbaixoDaMedia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos elementos terá o vetor? ");
        int n = scanner.nextInt();

        double[] vetor = new double[n];

        double soma = 0;
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite um valor: ");
            vetor[i] = scanner.nextDouble();
            soma += vetor[i];
        }

        System.out.println();
        double media = soma / vetor.length;
        System.out.printf("MÉDIA DOS VALORES = %.3f%n", media);

        System.out.println("ELEMENTOS ABAIXO DA MÉDIA: ");
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] < media) {
                System.out.printf("%.2f%n", vetor[i]);
            }
        }

        scanner.close();
    }
}
