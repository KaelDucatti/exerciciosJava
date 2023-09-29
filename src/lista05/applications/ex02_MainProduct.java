package lista05.applications;

import java.util.Scanner;
import lista05.entities.ex02_Product;

public class ex02_MainProduct {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ex02_Product product;
        product = new ex02_Product();

        System.out.println("Enter with the product name, price and quantity: ");
        product.name = scanner.nextLine();
        product.price = scanner.nextDouble();
        product.quantity = scanner.nextInt();

        System.out.println();
        System.out.println("Product data:" + product);

        System.out.println();
        System.out.println("Enter the number of products to be added in stock: ");
        int quantity = scanner.nextInt();
        product.addProducts(quantity);

        System.out.println();
        System.out.println("Product data:" + product);

        System.out.println();
        System.out.println("Enter the number of products to be removed in stock: ");
        quantity = scanner.nextInt();
        product.removeProducts(quantity);

        System.out.println();
        System.out.println("Product data:" + product);

        scanner.close();
    }
}
