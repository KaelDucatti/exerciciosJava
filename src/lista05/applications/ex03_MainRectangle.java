package lista05.applications;

import java.util.Scanner;
import lista05.entities.ex03_Rectangle;

public class ex03_MainRectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ex03_Rectangle rectangle;
        rectangle = new ex03_Rectangle();

        System.out.println("Enter rectangle width and heigh: ");
        rectangle.width = scanner.nextDouble();
        rectangle.height = scanner.nextDouble();

        System.out.printf("AREA = %.2f%n", rectangle.area());
        System.out.printf("PERIMENTER = %.2f%n", rectangle.perimeter());
        System.out.printf("DIAGONAL = %.2f%n", rectangle.diagonal());

        scanner.close();
    }
}
