import java.util.Scanner;
public class h1 {
    //kullanıcının girdiği 4 sayıyı ve ortalamasını veren program
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int a,b,c,d;
        double ortalama;
        System.out.print("sayı giriniz:");
        a= input.nextInt();
        System.out.print("sayı giriniz:");
        b= input.nextInt();
        System.out.print("sayı giriniz:");
        c= input.nextInt();
        System.out.print("sayı giriniz:");
        d= input.nextInt();

        ortalama= (a+b+c+d)/4;
        System.out.println(ortalama);



    }
}
