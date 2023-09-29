package lista02;

import java.util.Scanner;

public class ex01_ValorDaContaDoTelefone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int minutosUsados;
        double total;

        System.out.print("Minutos usados de telefonia: ");
        minutosUsados = sc.nextInt();
        System.out.println();

        if (minutosUsados > 100){
            total = ((minutosUsados - 100) * 2) + 50;
            System.out.printf("Total a pagar: R$ %.2f%n",  total);
        }
        else{
            System.out.println("Total a pagar: R$ 50");
        }

        sc.close();
    }
}
