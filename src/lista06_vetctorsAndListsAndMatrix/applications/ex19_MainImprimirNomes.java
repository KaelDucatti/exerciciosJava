package lista06_vetctorsAndListsAndMatrix.applications;

import java.util.Scanner;

/*
Crie um vetor com 10 nomes de pessoas e imprima-os na tela.
 */
public class ex19_MainImprimirNomes {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] vetor = new String[10];

        System.out.println("Insira 10 nomes de pessoas");

        for (int i = 0; i < vetor.length; i++) {
            System.out.print((i+1) + "# nome: ");
            vetor[i] = scanner.nextLine();
        }

        System.out.println();
        System.out.println("Lista de nomes: ");
        for (String i : vetor) {
            System.out.println(i + " ");
        }

        scanner.close();
    }
}
