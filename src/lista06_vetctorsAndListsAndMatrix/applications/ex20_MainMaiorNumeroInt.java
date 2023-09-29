package lista06_vetctorsAndListsAndMatrix.applications;

import java.util.Scanner;

/*
Crie um vetor com 10 números inteiros e encontre o maior e o menor número.
 */
public class ex20_MainMaiorNumeroInt {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int [] vetor = new int[10];

        System.out.println("Insira 10 números inteiros...");

        for (int i = 0; i < vetor.length; i++) {
            System.out.print((i+1) + "# número: ");
            vetor[i] = scanner.nextInt();
        }

        int maiorNumero = vetor[0];
        int menorNumero = vetor[0];

        for (int i : vetor) {
            if (i > maiorNumero) {
                maiorNumero = i;
            }
            if (i < menorNumero) {
                menorNumero = i;
            }
        }

        System.out.println("Maior número do vetor: " + maiorNumero);
        System.out.println("Menor número do vetor: " + menorNumero);

        scanner.close();
    }
}
