import java.util.Scanner;

public class recursiveIsPrime {

    static int isPrime(int sayi) {
        int sayac = 0;
        for (int i = 2; i < sayi; i++) {
            if (sayi == 2) // sayı iki ise asaldir.
            {
                break;
            } else if (sayi % i == 0) // sayının i'ye bölümünden kalan sıfır ise asal değildir.
            {
                sayac++;
                break;
            }
        }

        if (sayac == 0) // eğer dönen sayaç sıfır ise sayı asaldir.
        {
            System.out.println(sayi + " -- >> asaldır.");

        } else {
            System.out.println(sayi + " -- >> asal değildir.");
        }
        return sayac;
    }

    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        System.out.print("sayı giriniz: ");
        int sayi = oku.nextInt();
        oku.close();

        isPrime(sayi);

    }
}
