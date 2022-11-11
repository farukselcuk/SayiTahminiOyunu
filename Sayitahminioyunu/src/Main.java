import java.util.Random;
import java.util.Scanner;
//CTRL+ALT+ L = DÜZENLEMEK İÇİN
public class Main {
    public static void main(String[] args) {
        System.out.println("Hoş Geldiniz");
        System.out.println("Sayı Tahmini Oyunudur");
        System.out.println("Lütfen Bir Sayı Giriniz");
        Random rnd = new Random();
        int sayi = rnd.nextInt(101);
        Scanner input = new Scanner(System.in);
        int tahmin = input.nextInt();
        while (sayi != tahmin) {
            if (tahmin < 0 || tahmin > 101) {
                System.out.println("Yanlış Girdiniz , Girilen Sayı İstenilen Aralıkta Degil  ");
            } else if (tahmin < sayi) {
                System.out.println("Daha Büyük Bir Sayı Giriniz");
            } else {
                System.out.println("Daha Küçük Bir Sayı Giriniz");
            }
            System.out.println("Tekrar Deneyiniz ");
            tahmin = input.nextInt();
        }
        System.out.println("Helal Len Yusufi");
    }
}