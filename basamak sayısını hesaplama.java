//Girilen bir sayının basamak sayısını hesaplama
import java.util.Scanner;
public class h48 {
    public static void main(String args[]) {
        Scanner input= new Scanner(System.in);
        System.out.print("bir sayı giriniz:");
        int sayi= input.nextInt();
        int sayac=0;
while(sayi!=0){
    sayi=sayi/10;
    sayac++;
}
        System.out.println(sayac);
    }
}
