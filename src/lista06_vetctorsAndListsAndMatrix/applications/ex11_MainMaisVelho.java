package lista06_vetctorsAndListsAndMatrix.applications;

import java.util.Scanner;
import lista06_vetctorsAndListsAndMatrix.entities.ex11_Pessoas;

/*
Fazer um programa para ler um conjunto de nomes de pessoas e suas respectivas idades.
Os nomes devem ser armazenados em um vetor, e as idades em um outro vetor. Depois,
mostrar na tela o nome da pessoa mais velha.
 */

public class ex11_MainMaisVelho {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Número de pessoas: ");
        int n = scanner.nextInt();

        ex11_Pessoas[] pessoas = new ex11_Pessoas[n];

        int maisVelho = 0;
        for (int i = 0; i < pessoas.length; i++) {
            System.out.println("Dados da " + (i+1) + "a pessoa: ");
            System.out.print("Nome: ");
            scanner.nextLine();
            String nome = scanner.nextLine();
            System.out.print("Idade: ");
            int idade = scanner.nextInt();
            pessoas[i] = new ex11_Pessoas(nome, idade);

            if (pessoas[i].getIdade() > pessoas[maisVelho].getIdade()) {
                maisVelho = i;
            }
        }

        System.out.print("PESSOA MAIS VELHA: " + pessoas[maisVelho].getNome());

        scanner.close();
    }
}
