package lista01;

import java.util.Locale;
import java.util.Scanner;

public class ex06_AreaDasFormasGeometricas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double a, b, c;
        double triangulo, circulo, trapezio, quadrado, retangulo;

        System.out.println("Informe 3 valores: ");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        triangulo = (a * c) / 2;
        circulo = 3.14159 * (c * c);
        trapezio = ((a + b) * c) / 2;
        quadrado = b * b;
        retangulo = a * b;

        System.out.println();
        System.out.printf("Triângulo: %.3f%n", triangulo);
        System.out.printf("Círculo: %.3f%n", circulo);
        System.out.printf("Trapézio: %.3f%n", trapezio);
        System.out.printf("Quadrado: %.3f%n", quadrado);
        System.out.printf("Retângulo: %.3f%n", retangulo);

        sc.close();
    }
}
