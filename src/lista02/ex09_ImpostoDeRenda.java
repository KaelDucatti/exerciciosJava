package lista02;

import java.util.Scanner;

/*
    Leia um valor com duas casas decimais, equivalente ao salário de uma pessoa.
    Em seguida, calcule e mostre o valor que esta pessoa deve pagar de Imposto de Renda,
    segundo a tabela abaixo. Lembre que, se o salário for R$ 3002.00, a taxa que incide é de 8%
    apenas sobre R$ 1000.00, pois a faixa de salário que fica de R$ 0.00 até R$ 2000.00 é isenta
    de Imposto de Renda. No exemplo fornecido (abaixo), a taxa é de 8% sobre R$ 1000.00 + 18% sobre R$ 2.00,
    o que resulta em R$ 80.36 no total. O valor deve ser impresso com duas casas decimais.
 */
public class ex09_ImpostoDeRenda {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double salario, impostoDeRenda = 0;

        System.out.print("Salário: ");
        salario = sc.nextDouble();

        if (salario > 4500.0){
            impostoDeRenda = (1000 * (8.0/100)) + (1500.0 * (18.0/100)) + ((salario - 4500) * (28.0/100));
        } else if (salario > 3000.0) {
            impostoDeRenda = (1000 * (8.0/100)) + ((salario - 3000) * (18.0/100));
        } else if (salario > 2000.0) {
            impostoDeRenda = (salario - 2000) * (8.0/100);
        } else {
            System.out.println("Isento");
        }

        System.out.println();
        System.out.printf("Imposto de renda: $ %.2f%n", impostoDeRenda);

        sc.close();
    }
}
