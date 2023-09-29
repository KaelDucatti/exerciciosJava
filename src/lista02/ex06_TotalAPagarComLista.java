package lista02;

import java.util.Scanner;

/*
    Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item.
    A seguir, calcule e mostre o valor da conta a pagar.

 */
public class ex06_TotalAPagarComLista {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cod, qtd;
        double total = 0;

        System.out.print("Código do item: ");
        cod = sc.nextInt();
        System.out.print("Quantidade: ");
        qtd = sc.nextInt();

        switch (cod) {
            case 1 -> total = qtd * 4;
            case 2 -> total = qtd * 4.5;
            case 3 -> total = qtd * 5;
            case 4 -> total = qtd * 2;
            case 5 -> total = qtd * 1.5;
            default -> System.out.println("Valor inválido");
        }

        System.out.println();
        System.out.printf("Total: $ %.2f", total);
        
        sc.close();
    }
}
