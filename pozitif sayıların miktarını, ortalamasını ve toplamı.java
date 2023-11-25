import java.util.Scanner;
public class h33 {
    //Bilgisayara girilen pozitif sayıların miktarını, ortalamasını ve
    //toplamını bulan ve negatif bir sayı girdiğinizde durdurucu işleve sahip bir Java
    //programı yazınız.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi;
        int sayac=0;
        int i=1;
        int toplam=0;
        int kacSayi;

        while(i>0){
            System.out.print("bir sayı giriniz:");
            sayi = input.nextInt();
            if(sayi>0){
            sayac++;
            toplam+=sayi;
           double  ort= toplam/sayac;

            }else{
                break;
            }




        }
        System.out.println("toplamları:" + toplam);
        System.out.println("ortalamaları:"+ toplam/sayac);
        System.out.println("sayı miktarı:"+ sayac);
    }
}