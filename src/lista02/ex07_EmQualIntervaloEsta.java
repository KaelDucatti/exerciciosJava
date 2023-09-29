package lista02;

import java.util.Scanner;

/*
    Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual
    dos seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Obviamente
    se o valor não estiver em nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”.
 */
public class ex07_EmQualIntervaloEsta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double valorQualquer;

        System.out.println("Valor qualquer: ");
        valorQualquer = sc.nextDouble();

        if (valorQualquer < 0 || valorQualquer > 100){
            System.out.println("Fora do intervalo");
        } else if (valorQualquer <= 25.0 ) {
            System.out.println("Intervalo [0,25]");
        } else if (valorQualquer <= 50.0) {
            System.out.println("Intervalo [25,50]");
        } else if (valorQualquer <= 75.0) {
            System.out.println("Intervalo [50,75]");
        }else {
            System.out.println("Intervalo [75,100]");
        }

        sc.close();
    }
}
