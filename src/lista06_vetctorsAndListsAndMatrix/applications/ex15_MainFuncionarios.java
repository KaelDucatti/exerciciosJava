package lista06_vetctorsAndListsAndMatrix.applications;

import lista06_vetctorsAndListsAndMatrix.entities.ex15_Funcionarios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
    Fazer um programa para ler um número inteiro N e depois os dados (id, nome e salario) de N funcionários.

    Não deve haver repetição de id. Em seguida, efetuar o aumento de X por cento no salário de um determinado funcionário.
    Para isso, o programa deve ler um id e o valor X. Se o id informado não existir, mostrar uma mensagem e abortar a operação.

    Ao final, mostrar a listagem atualizada dos funcionários, conforme exemplos. Lembre-se de aplicar a técnica de encapsulamento
    para não permitir que o salário possa ser mudado livremente. Um salário só pode ser aumentado com base em uma operação de
    aumento por porcentagem dada.
 */

public class ex15_MainFuncionarios {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos empregados serão registrados? ");
        int n = scanner.nextInt();

        List<ex15_Funcionarios> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.println();
            System.out.println("Funcionário #" + (i+1));
            System.out.print("Id: ");
            int id = scanner.nextInt();
            System.out.print("Nome: ");
            scanner.nextLine();
            String nome = scanner.nextLine();
            System.out.print("Salário: ");
            double salario = scanner.nextDouble();

            list.add(new ex15_Funcionarios(id, nome, salario));
        }

        System.out.println();
        System.out.print("Entre com o id do funcionario receberá aumento no salário: ");
        int id = scanner.nextInt();

        ex15_Funcionarios result = list.stream().filter(obj -> obj.getId() == id).findFirst().orElse(null);

        if (result != null) {
            System.out.print("Entre com a porcentagem do incremento: ");
            double porcentagem = scanner.nextDouble();
            result.salarioIncremento(porcentagem);
        } else {
            System.out.println("Este id não existe");
        }

        System.out.println();
        System.out.println("Lista de empregados: ");
        for (ex15_Funcionarios obj : list) {
            System.out.println(obj);
        }

        scanner.close();
    }
}
