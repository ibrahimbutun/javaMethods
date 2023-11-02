import java.util.Scanner;

public class recursiveNumber {

    static void minusNumber(int number) {
        System.out.print(number + " ");
        if (number <= 0) {
            return;
        }
        minusNumber(number - 5);
        System.out.print(number + " ");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("give a number: ");
        int number = scanner.nextInt();
        minusNumber(number);

        scanner.close();
    }
}
