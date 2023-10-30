import java.util.Scanner;

public class advancedCalculator {

    static int sum(int a, int b) {
        int result = a + b;
        System.out.println("Toplam = " + result);
        return result;
    }

    static int mod(int a, int b) {
        return a % b;
    }

    static int perimeterOfRectangle(int a, int b) {
        int perimeter = 2 * (a + b);
        System.out.println("Dikdörtgen çevresi: " + perimeter);
        return perimeter;
    }

    static int power(int a, int b) {
        int result = 1;
        for (int i = 1; i <= b; i++) {
            result *= a;
        }
        System.out.println("------------------------");
        System.out.println("Üs Alma Sonucu: " + result);
        System.out.println("------------------------");
        return result;
    }

    public static void main(String[] args) {

        while (true) {
            System.out.println(
                    "1.Toplama\n2.Çıkarma\n3.Çarpma\n4.Mod Alma\n5.Dikdörtgen Hesabı\n6.Üs Alma\nBir işlem seçiniz...");
            Scanner scanner = new Scanner(System.in);
            int select = scanner.nextInt();
            if (select == 0) {
                System.out.println("Çıkış yapılıyor...");
                break;
            }
            System.out.println("ilk sayıyı giriniz..");
            int a = scanner.nextInt();
            System.out.println("ikinci sayıyı giriniz..");
            int b = scanner.nextInt();
            scanner.close();

            switch (select) {
                case 1:
                    sum(a, b);
                    break;
                case 4:
                    System.out.println("------------------------");
                    System.out.println("Mod İşlemi: " + mod(a, b));
                    System.out.println("------------------------");
                    break;
                case 5:
                    perimeterOfRectangle(a, b);
                    break;
                case 6:
                    power(a, b);
                    break;
            }
        }
    }
}
