package lista06_vetctorsAndListsAndMatrix.applications;

import java.util.Scanner;
import lista06_vetctorsAndListsAndMatrix.entities.ex14_Rooms;

public class ex14_MainQuartosAlugados {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many rooms will be rented? ");
        int n = scanner.nextInt();

        ex14_Rooms[] vetor = new ex14_Rooms[10];

        for (int i = 0; i < n; i++) {
            scanner.nextLine();
            System.out.println();
            System.out.println("RENT #" + (i+1));
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Email: ");
            String email = scanner.nextLine();
            System.out.print("Room: ");
            int room = scanner.nextInt();

            vetor[room] = new ex14_Rooms(name, email);
        }

        System.out.println();
        System.out.println("Busy rooms: ");
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] != null) {
                System.out.println(i + ": " + vetor[i]);
            }
        }

        scanner.close();
    }
}
