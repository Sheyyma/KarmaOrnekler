import java.util.Scanner;
public class h27 {
//- n üzeri değerini hesaplayan java kodunu yazınız?
    public static void main(String[] args) {
int toplam=1;
        Scanner input= new Scanner(System.in);
        System.out.print("bir taban giriniz:");
        int taban= input.nextInt();
        System.out.print("bir kuvvet giriniz:");
        int kuvvet= input.nextInt();
        for(int i=1; i<=kuvvet; i++){
            toplam*= taban;
        }
        System.out.println(toplam);



    }
}
