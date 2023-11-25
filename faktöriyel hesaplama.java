import java.util.Scanner;
public class h4 {
    // faktöriyel hesaplama
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int n;
        int fak=1;
        System.out.print("bie sayı giriniz:");
        n= input.nextInt();
        for( int i=1 ; i<=n ; i++ ){
            fak*= i;
        }
        System.out.println(fak);
    }

}
