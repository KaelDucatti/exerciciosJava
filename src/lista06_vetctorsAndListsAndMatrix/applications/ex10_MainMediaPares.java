package lista06_vetctorsAndListsAndMatrix.applications;

import java.util.Scanner;

/*
    Fazer um programa para ler um vetor de N números inteiros. Em seguida, mostrar na tela
    a média aritmética somente dos números pares lidos, com uma casa decimal. Se nenhum número
    par for digitado, mostrar a mensagem "NENHUM NUMERO PAR"
 */

public class ex10_MainMediaPares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos elementos terá o vetor? ");
        int n = scanner.nextInt();

        int somaPares = 0;
        int pares = 0;
        int[] vetor = new int[n];
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite um número: ");
            vetor[i] = scanner.nextInt();
            if (vetor[i] % 2 == 0) {
                somaPares += vetor[i];
                pares++;
            }
        }

        double media = (double) somaPares / pares;

        System.out.println();
        if (pares != 0) {
            System.out.printf("MÉDIA DOS PARES = %.1f%n", media);
        } else {
            System.out.println("NENHUM NÚMERO PAR");
        }

        scanner.close();
    }
}
