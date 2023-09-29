package lista06_vetctorsAndListsAndMatrix.applications;

import java.util.Scanner;

public class ex08_MainSomaVetores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos valores terá cada vetor? ");
        int n = scanner.nextInt();

        int[] vetorA = new int[n];
        int[] vetorB = new int[n];
        int[] vetorC = new int[n];

        System.out.println("Digite os valores do vetor A:");
        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = scanner.nextInt();
        }

        System.out.println("Digite os valores do vetor B");
        for (int i = 0; i < vetorB.length; i++) {
            vetorB[i] = scanner.nextInt();
        }

        System.out.println("VETOR RESULTANTE: ");
        for (int i = 0; i < n; i++) {
            vetorC[i] = vetorA[i] + vetorB[i];
            System.out.println(vetorC[i]);
        }

        scanner.close();
    }
}
