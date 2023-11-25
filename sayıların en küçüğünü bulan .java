import java.util.Scanner;
public class h38 {
    // Bilgisayarınıza girilen tam sayıların en küçüğünü bulan bir Java programı
    //yazınız. Kaç tane tam sayı girileceği kullanıcı tarafından belirlenecektir.
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("kaç sayı gireceksiniz:");
        int n= input.nextInt();
        System.out.print("sayı giriniz:");
        int sayi1= input.nextInt();
        int ek=sayi1;
        for (int i=1; i<n; i++){
            System.out.print("sayı giriniz:");
            int sayi=input.nextInt();
            if(ek>=sayi){
                ek=sayi;

            }
        }
        System.out.println(ek);





    }
}
