import java.util.Scanner;
public class h13 {
    //10 sayı toplamı
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int i=1;
        int toplam=0;
        int sayi;
        while(i<=10){
            System.out.print("bir sayı giriniz:");
            sayi= input.nextInt();
            i++;
            toplam+=sayi;

        }
        System.out.println(toplam);


    }
}
