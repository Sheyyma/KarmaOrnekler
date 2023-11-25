import java.util.Scanner;
public class h34 {
    //Kullanıcıdan alınan 2 sayı arasındaki sayılardan, yine kullanıcıdan alınan bir
    //“bölen”e tam bölünen sayıları ve bunların toplamını gösteren programı yazın.
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int sayi1, sayi2, bolen,bolunenler;
        int toplam=0;
        System.out.print("bir sayı giriniz:");
        sayi1= input.nextInt();
        System.out.print("bir sayı giriniz:");
        sayi2= input.nextInt();
        System.out.print("bölen yazınız:");
        bolen= input.nextInt();

        for(int i=sayi1; i<=sayi2; i++){
            if(i%bolen==0){
            System.out.print(+ i+ " ");
            toplam+=i;

        }



    }
        System.out.println("toplamları:"+ toplam);
}}
