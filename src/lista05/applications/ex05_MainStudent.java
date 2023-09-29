package lista05.applications;

import lista05.entities.ex05_Student;

import java.util.Scanner;

public class ex05_MainStudent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ex05_Student student;
        student = new ex05_Student();

        student.name = scanner.nextLine();
        student.grade1 = scanner.nextDouble();
        student.grade2 = scanner.nextDouble();
        student.grade3 = scanner.nextDouble();

        double finalGrade = student.finalGrade();
        System.out.printf("FINAL GRADE: %.2f%n", finalGrade);
        student.passOrFailed();
        System.out.println();

        scanner.close();
    }
}
