import java.util.Scanner;

public class recursivePower {

    static int power(int a, int b) {
        if (b == 0) {
            System.out.println("1");            
            return 1;
        }
        int result = 1;
        for (int i = 1; i <= b; i++) {
            result *= a;
        }
        System.out.println("Sonuc = " + result);
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // int select = scanner.nextInt();
        System.out.print("Taban değerini giriniz: ");
        int taban = scanner.nextInt();
        System.out.print("Üs değerini giriniz: ");
        int üs = scanner.nextInt();
        scanner.close();
        power(taban, üs);
    }
}
