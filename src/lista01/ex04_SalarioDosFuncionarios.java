package lista01;

import java.util.Scanner;

public class ex04_SalarioDosFuncionarios {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numFuncionario, horasTrabalhadas;
        double valorHora, salario;

        System.out.print("Número do funcionário: ");
        numFuncionario = sc.nextInt();
        System.out.print("Horas trabalhadas: ");
        horasTrabalhadas = sc.nextInt();
        System.out.print("Valor por hora: ");
        valorHora = sc.nextDouble();

        salario = horasTrabalhadas * valorHora;

        System.out.println();
        System.out.println("Número do funcionário: " + numFuncionario);
        System.out.printf("Salário: R$ %.2f%n", salario);

        sc.close();
    }
}
