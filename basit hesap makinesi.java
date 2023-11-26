import java.util.Scanner;
public class deneme1 {
    public static void main(String[] args) {
        int a, b, toplama, cikartma,carpma;
        double bolme;
        Scanner input= new Scanner(System.in);

        System.out.print("a sayısını giriniz:");
        a= input.nextInt();

        System.out.print("b sayısını giriniz:");
        b= input.nextInt();

        toplama= a+b;
        cikartma= a-b;
        carpma=a*b;
        bolme= (double) a/b;

        System.out.println("toplam:"+toplama);
        System.out.println("çıkartma:"+cikartma);
        System.out.println("çarpma:"+carpma);
        System.out.println("bölme:"+bolme);



    }
}
