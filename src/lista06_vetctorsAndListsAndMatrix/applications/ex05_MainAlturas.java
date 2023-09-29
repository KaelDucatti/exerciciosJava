package lista06_vetctorsAndListsAndMatrix.applications;

import java.util.Scanner;
import lista06_vetctorsAndListsAndMatrix.entities.ex05_Pessoas;

public class ex05_MainAlturas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantas pessoas serão digitadas? ");
        int n = scanner.nextInt();


        ex05_Pessoas[] vetor = new ex05_Pessoas[n];

        double soma = 0;
        int menorIdade = 0;
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Dados da " + (i+1) + " pessoa: ");
            System.out.print("Nome: ");
            scanner.nextLine();
            String nome = scanner.nextLine();
            System.out.print("Idade: ");
            int idade = scanner.nextInt();
            System.out.print("Altura: ");
            double altura = scanner.nextDouble();

            vetor[i] = new ex05_Pessoas(nome, idade, altura);
            soma += vetor[i].getAltura();

            if (vetor[i].getIdade() < 16) {
                menorIdade++;
            }
        }

        double qtdMenor =  ((double)menorIdade/n) * 100;

        System.out.printf("Altura média: %.2f%n", soma/n);
        System.out.printf("Pessoas com menos de 16 anos: %%%.2f%n", qtdMenor);

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i].getIdade() < 16) {
                System.out.println(vetor[i].getNome());
            }
        }

        scanner.close();
    }
}
