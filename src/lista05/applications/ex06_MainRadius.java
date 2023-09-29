package lista05.applications;

import java.util.Scanner;
import lista05.entities.ex06_Radius;

public class ex06_MainRadius {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ex06_Radius radius = new ex06_Radius();

        System.out.print("Enter radius: ");
        radius.radius = scanner.nextDouble();

        System.out.printf("Circumference: %.2f%n", radius.circunference());
        System.out.printf("Volume: %.2f%n", radius.sphereVolume());
        System.out.print("PI value: " + radius.PI);
        System.out.println();

        scanner.close();
    }
}
