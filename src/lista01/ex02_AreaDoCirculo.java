package lista01;

import java.util.Scanner;

public class ex02_AreaDoCirculo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double raio, area;

        System.out.print("Raio do círculo: ");
        raio = sc.nextDouble();

        area = 3.14159 * (raio * raio);

        System.out.printf("Área: %.4f%n", area );

        sc.close();
    }
}
