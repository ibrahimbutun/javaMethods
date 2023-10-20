import java.util.Scanner;

public class isPalindrom {
    static boolean isitPalindrom(int number) {
        int temp = number, reverseNumber = 0, lastNumber;

        while (temp != 0) {
            lastNumber = temp % 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            temp /= 10;
        }

        if (number == reverseNumber) {
            System.out.println("palindrom");
        }

        else {
            System.out.println("not palindrom");
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("sayi giriniz: ");
        int input = scanner.nextInt();
        scanner.close();
        isitPalindrom(input);
    }
}
