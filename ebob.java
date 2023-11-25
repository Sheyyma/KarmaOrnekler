import java.util.Scanner;
public class h15 {
    //ebob
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int ebob=1;
        int k=2;
        int sayi1;
        int sayi2;
        System.out.print("birinci sayıyı giriniz:");
        sayi1= input.nextInt();
        System.out.print("ikinci sayıyı giriniz:");
        sayi2= input.nextInt();
        while ((k<=sayi1) && (k<=sayi2)){
    if ((sayi1%k==0) && (sayi2%k==0)) {
        ebob=k;

    }
    k++;


}
        System.out.println("ebobları:" + ebob);

    }}
