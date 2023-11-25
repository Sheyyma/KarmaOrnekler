//Girilen bir binary sayının onluk karşılığını hesaplama
import java.util.Scanner;
public class h50 {
    public static void main(String[] args) {
        int dec=0, kalan, j=1;
        Scanner klavye = new Scanner(System.in);
        System.out.print("Bir binary sayi giriniz:");
        int bin = klavye.nextInt();
        while (bin != 0) {
            kalan = bin % 10;
            dec = dec + kalan * j;
            j = j * 2;
            bin = bin / 10;
        }
        System.out.println("Onluk karsılıgı: "+dec);

    }
}
