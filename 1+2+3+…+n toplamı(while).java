import java.util.Scanner;
public class h36 {
    //1+2+3+…+n toplamını hesaplayacak bir Java programı yazınız. İlk
    //programınızı while deyimi ile
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int n;
        System.out.print("bir sayı giriniz:");
        n= input.nextInt();
        int i=0;
        int toplam=0;
        while(i<n){
            i++;
            toplam+=i;

        }
        System.out.println(toplam);

    }
}
