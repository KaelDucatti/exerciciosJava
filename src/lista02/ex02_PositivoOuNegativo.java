package lista02;

import java.util.Scanner;

// Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.
public class ex02_PositivoOuNegativo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;

        System.out.print("O número inteiro ");
        num = sc.nextInt();

        if (num >= 0){
            System.out.print("é não negativo");
        }
        else{
            System.out.print("é negativo");
        }

        System.out.println();
        sc.close();
    }
}
