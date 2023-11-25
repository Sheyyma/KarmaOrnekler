import java.util.Scanner;
public class h29 {
    //1
    //2 3
    //4 5 6
    //7 8 9 10
    //11 12 13 14 15
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int sayilar=1;
        int sayi;
        System.out.print("basamak sayısı giriniz:");
        sayi=input.nextInt();
        for(int i=1; i<=sayi; i++ ){
            System.out.println(" ");
            for(int j=1; j<=i; j++){
                System.out.print(sayilar+ " ");
                sayilar++;
            }
        }

    }
}
