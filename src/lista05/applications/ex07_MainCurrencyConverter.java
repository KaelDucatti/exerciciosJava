package lista05.applications;

import java.util.Scanner;
import lista05.entities.ex07_CurrecyConverter;

public class ex07_MainCurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ex07_CurrecyConverter currecyConverter = new ex07_CurrecyConverter();

        System.out.print("What is the dollar price? ");
        currecyConverter.dollar = scanner.nextDouble();

        System.out.print("How many dollars will be bought? ");
        currecyConverter.boughtDollars = scanner.nextDouble();

        System.out.printf("Amount to be paid in reais: %.2f%n", currecyConverter.cambio());

        scanner.close();
    }
}
