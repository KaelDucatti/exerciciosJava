
import java.util.Scanner;

public class drawboard {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Input an integer: ");
        int input = scanner.nextInt();
        System.out.print("The sum of the algarisms is: " + sumDigits(input));

    }

    public static int sumDigits(int input) {
        int sum = 0;
        while (input != 0) {
            sum += input % 10;
            input = input / 10;
        }
        return sum;
    }

}
