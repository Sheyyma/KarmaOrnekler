import java.util.Scanner;
public class h37 {
    //1+2+3+…+n toplamını hesaplayacak bir Java programı yazınız. İlk
    //programınızı for deyimi ile
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int n;
        int toplam=0;
        System.out.print("bir sayı giriniz:");
        n= input.nextInt();
        for (int i=0;i<=n; i++ ){
            toplam+=i;

        }
        System.out.print(toplam);

    }
}
