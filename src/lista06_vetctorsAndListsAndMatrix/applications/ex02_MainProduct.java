package lista06_vetctorsAndListsAndMatrix.applications;

import java.util.Scanner;
import lista06_vetctorsAndListsAndMatrix.entities.ex02_Product;

public class ex02_MainProduct {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter with the 'n': ");
        int n = scanner.nextInt();

        ex02_Product[] vector = new ex02_Product[n];

        double sum = 0;
        for (int i = 0; i < vector.length; i++) {
            System.out.println("%nProduct " + i + ": ");
            scanner.nextLine();
            String name = scanner.nextLine();
            double price = scanner.nextDouble();
            vector[i] = new ex02_Product(name, price);
            sum += price;
        }

        double avg = sum / vector.length;

        System.out.printf("%nAVERAGE PRICE = $ %.2f%n", avg);

        scanner.close();
    }
}
