package lista06_vetctorsAndListsAndMatrix.applications;

import java.util.Scanner;

/*
Fazer um programa para ler dois números inteiros M e N, e depois ler uma matriz de M linhas
por N colunas contendo números inteiros, podendo haver repetições. Em seguida, ler um número
inteiro X que pertence à matriz. Para cada ocorrência de X, mostrar os valores à esquerda,
acima, à direita e abaixo de X, quando houver, conforme exemplo.
 */

public class ex17_MainMatrizMN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Número de linhas: ");
        int linhas = scanner.nextInt();
        System.out.print("Número de colunas: ");
        int colunas = scanner.nextInt();

        int[][] matriz = new int[linhas][colunas];

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }

        System.out.print("Escolha um número dentro os digitados: ");
        int n = scanner.nextInt();

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                if (n == matriz[i][j]) {

                    System.out.print("Posição: " + i +", " + j);

                    if(j != 0) {
                        System.out.println();
                        System.out.print("Esquerda: " + matriz[i][j - 1]);
                    }

                    if (j != colunas - 1) {
                        System.out.println();
                        System.out.print("Direita: " + matriz[i][j + 1]);
                    }

                    if (i != linhas - 1) {
                        System.out.println();
                        System.out.print("Abaixo: " + matriz[i + 1][j]);
                    }

                    if (i != 0) {
                        System.out.println();
                        System.out.print("Acima: " + matriz[i - 1][j]);
                    }

                    System.out.println();
                }

            }
        }

        scanner.close();
    }
}
