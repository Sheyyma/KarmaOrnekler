import java.util.Scanner;
public class h7{
    // kuvvetini alma
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int taban;
        int kuvvet;
        int islem=1;
        System.out.print("taban giriniz:");
        taban= input.nextInt();
        System.out.print("kuvvet giriniz:");
        kuvvet= input.nextInt();

        for(int i=1 ; i<=kuvvet ; i++) {
            islem*=taban;
        }
        System.out.println(islem);




    }
}
