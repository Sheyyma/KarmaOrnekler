import java.util.Scanner;
public class deneme5 {
    public static void main(String[] args) {
        int sayi;
        Scanner input= new Scanner(System.in);
        System.out.println("bir sayı giriniz:");
        sayi= input.nextInt();
        System.out.println( (sayi%2==0)? sayi + "çifttir": sayi + "tektir");

    }

}
