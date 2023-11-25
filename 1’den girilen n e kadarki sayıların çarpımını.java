import javax.net.ssl.SSLContext;
import java.util.Scanner;
public class h30 {
   //1’den girilen n sayısına kadarki sayıların çarpımını
   //yapacak şekilde tamamlayınız?.
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("bir sayı giriniz:");
        int n= input.nextInt();
        int carpim=1;
        for(int i=1; i<=n; i++){
            carpim*=i;

        }
        System.out.print(carpim);



    }
}
