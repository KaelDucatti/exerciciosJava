package lista01;

import java.util.Scanner;

public class ex05_ValorTotalPeças {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int codPeca1, codPeca2, qtdPeca1, qtdPeca2;
        double valorPeca1, valorPeca2, total;

        System.out.println("01 - Informe o código, quantidade e valor unitário: ");
        codPeca1 = sc.nextInt();
        qtdPeca1 = sc.nextInt();
        valorPeca1 = sc.nextDouble();
        System.out.println();
        System.out.println("02 - Informe o código, quantidade e valor unitário: ");
        codPeca2 = sc.nextInt();
        qtdPeca2 = sc.nextInt();
        valorPeca2 = sc.nextDouble();

        total  = qtdPeca1 * valorPeca1 + qtdPeca2 * valorPeca2;

        System.out.printf("Valor a pagar: %.2f%n", total);

        sc.close();
    }
}
