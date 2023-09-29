package lista01;

import java.util.Scanner;

public class ex03_DiferencaEntreProdutos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, c, d, diferenca;

        System.out.println("Informe 4 valores: ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();

        diferenca = (a * b - c * d);

        System.out.println("Diferença entre os produtos: " + diferenca);

        sc.close();
    }
}
