package lista06_vetctorsAndListsAndMatrix.applications;


import java.util.Scanner;

/*
 Crie um vetor com 5 números inteiros e imprima-os na tela.
 */
public class ex18_MainImprimirNumeros {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] vetor = new int[5];

        for (int i = 0; i < vetor.length; i++) {
            System.out.print((i+1) + "# Valor: " );
            vetor[i] = scanner.nextInt();
        }

        System.out.print("Vetor = [ ");
        for (int i : vetor) {
            System.out.print(i + "  ");
        }
        System.out.print("]");

        scanner.close();
    }
}
