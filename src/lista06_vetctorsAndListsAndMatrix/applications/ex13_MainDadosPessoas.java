package lista06_vetctorsAndListsAndMatrix.applications;

import java.util.Scanner;
import lista06_vetctorsAndListsAndMatrix.entities.ex13_Pessoas;

public class ex13_MainDadosPessoas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantas pessoas serão digitadas? ");
        int n = scanner.nextInt();

        ex13_Pessoas[] pessoas = new ex13_Pessoas[n];

        int maiorAltura = 0;
        int menorAltura = 0;
        int numeroHomens = 0;
        int numeroMulheres = 0;
        double somaAlturasMulheres = 0;

        for (int i = 0; i < pessoas.length; i++) {
            System.out.print("Altura da " + (i+1) + "a pessoa: ");
            double altura = scanner.nextDouble();

            // Consumir a nova linha pendente após a entrada da altura
            scanner.nextLine();

            System.out.print("Gênero da " + (i+1) + "a pessoa (M/F): ");
            char genero = scanner.nextLine().charAt(0);
            pessoas[i] = new ex13_Pessoas(altura, genero);

            if (pessoas[i].getAltura() > pessoas[maiorAltura].getAltura()) {
                maiorAltura = i;
            }
            if (pessoas[i].getAltura() < pessoas[menorAltura].getAltura()) {
                menorAltura = i;
            }

            if (genero == 'f' || genero == 'F') {
                somaAlturasMulheres += pessoas[i].getAltura();
                numeroMulheres++;
            } else {
                numeroHomens++;
            }

        }

        System.out.println();
        System.out.printf("Menor altura = %.2f%n", pessoas[menorAltura].getAltura());
        System.out.printf("Maior altura = %.2f%n", pessoas[maiorAltura].getAltura());

        if (numeroMulheres > 0) {
            System.out.printf("MÉDIA DAS ALTURAS DAS MULHERES = %.2f%n", somaAlturasMulheres /numeroMulheres);
        } else {
            System.out.println("Nenhuma mulher foi inserida.");
        }

        System.out.printf("Número de homens = %d%n", numeroHomens);

        scanner.close();
    }
}
