//Girilen bir sayının binary karşılığını hesaplama
import java.util.Scanner;
public class h49 {
    public static void main(String[] args) {
        int i=0, kalan;
        String binary="";
        Scanner klavye = new Scanner(System.in);
        System.out.print("Bir sayi giriniz: ");
        int num = klavye.nextInt();
        while (num != 0) {
            kalan = num % 2;
            binary=kalan+binary;
            num = num / 2;
        }
        System.out.println(binary);
    }
}
