import java.util.Scanner;
public class deneme17 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int sayi1, sayi2;
        System.out.print("birinci sayıyı giriniz:");
        sayi1 = input.nextInt();
        System.out.print("ikinci sayıyı giriniz:");
        sayi2 = input.nextInt();
        int ortak;
        boolean asalmi=true;
        for(int i=2; i<=sayi1; i++){
            if((sayi1%i==0) && (sayi2%i==0)){
                System.out.println("ortak bölen:"+i);
                asalmi=false;
            }
        }
        if (asalmi){
            System.out.println("iki sayı aralarında asaldır");
        }else{
            System.out.println("aralarında asal değildir");
        }
    }
}
