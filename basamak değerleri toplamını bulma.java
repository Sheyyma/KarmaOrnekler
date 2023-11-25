//Girilen bir sayının basamak değerleri toplamını bulma
import java.util.Scanner;
public class h51 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Bir sayi giriniz:");
        int num = input.nextInt();
        int sum = 0;
        while (num != 0) {
            sum += num % 10;
            num = num/ 10;
        }
        System.out.println("Girilen sayinin basamak degeri toplami: "+sum);


    }
          }