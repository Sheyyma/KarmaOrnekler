//Girilen bir sayının palindrom (tersi) olup olmadığını bulma
import java.util.Scanner;
public class h53 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir cumle giriniz:");
        String cumle = input.next();
        String terscumle = "";
        int boyut = cumle.length();
        for (int i = (boyut - 1); i >= 0; --i) {
            terscumle = terscumle + cumle.charAt(i);
        }

        if (cumle.toLowerCase().equals(terscumle.toLowerCase()))
            System.out.println(cumle + " Palindrom'dur");
        else
            System.out.println(cumle + " Palindrom degildir");

    }
}
