package lista06_vetctorsAndListsAndMatrix.applications;

import java.util.Scanner;

public class ex01_MainAvaregeHeight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Número de iterações: ");
        int n = scanner.nextInt();

        double sum = 0;
        double[] vector = new double[n];
        System.out.println("Alturas: ");
        for (int i = 0; i < n; i++) {
            vector[i] = scanner.nextDouble();
            sum += vector[i];
        }

        double avgHeight = sum / n;

        System.out.printf("%nAVAREGE HEIGHT: %.2f%n", avgHeight);

        scanner.close();
    }
}
