package lista06_vetctorsAndListsAndMatrix.applications;

import java.util.Scanner;
import lista06_vetctorsAndListsAndMatrix.entities.ex12_Alunos;

/*
    Fazer um programa para ler um conjunto de N nomes de alunos, bem como as notas que
    eles tiraram no 1º e 2º semestres. Cada uma dessas informações deve ser armazenada
    em um vetor. Depois, imprimir os nomes dos alunos aprovados, considerando aprovados
    aqueles cuja média das notas seja maior ou igual a 6.0 (seis).
 */

public class ex12_MainAprovados {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos alunos serão digitados? ");
        int n = scanner.nextInt();

        ex12_Alunos[] alunos = new ex12_Alunos[n];

        for (int i = 0; i < alunos.length; i++) {
            System.out.println("Digite nome, p1 e p2 do " + (i+1) + "o Aluno: ");
            scanner.nextLine();
            String nome = scanner.nextLine();
            double p1 = scanner.nextDouble();
            double p2 = scanner.nextDouble();
            alunos[i] = new ex12_Alunos(nome, p1, p2);
        }

        System.out.println();
        System.out.println("ALUNO APROVADOS: ");
        for (int i = 0; i < alunos.length; i++) {
            if (alunos[i].media() >= 6.0) {
                System.out.println(alunos[i].getNome());
            }
        }

        scanner.close();
    }
}
