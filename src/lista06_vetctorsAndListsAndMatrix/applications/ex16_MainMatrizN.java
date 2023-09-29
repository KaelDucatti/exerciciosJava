package lista06_vetctorsAndListsAndMatrix.applications;

import java.util.Scanner;

/*
Fazer um programa para ler um número inteiro N e uma matriz de ordem N contendo números inteiros.
Em seguida, mostrar a diagonal principal e a quantidade de valores negativos da matriz.
 */

public class ex16_MainMatrizN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Número de elementos: ");
        int n = scanner.nextInt();

        int[][] matriz = new int[5][2];

        int negativos = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = scanner.nextInt();
                if (matriz[i][j] < 0) {
                    negativos++;
                }
            }
        }

        System.out.println();
        System.out.println("Diagonal principal: ");
        for (int i = 0; i < matriz.length; i++) {
            System.out.print(matriz[i][i] + " ");
        }

        System.out.println();
        System.out.print("Números negativos = " + negativos);

        scanner.close();
    }
}
