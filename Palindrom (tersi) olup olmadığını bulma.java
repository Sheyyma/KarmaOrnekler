//Girilen bir sayının palindrom (tersi) olup olmadığını bulma
import java.util.Scanner;
public class h52 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int kalan, sum = 0, temp;
        System.out.print("Bir sayi giriniz:");
        int num = input.nextInt();
        temp = num;
        while (num > 0) {
            kalan = num % 10;
            num = num / 10;
            sum = (sum * 10) + kalan;
        }
        if (temp == sum)
            System.out.println("palindrom'dur");
        else
            System.out.println("palindrom degildir");
    }
}
