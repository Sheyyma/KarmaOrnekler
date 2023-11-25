import java.util.Scanner;
public class h16 {
    //ekrandan 0 girilene kadar o sayıları toplayan program
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int n;
        int toplam=0;
        for(int i=0 ; i>=0 ; i++ ){
            System.out.print("bir sayı giriniz:");
            n= input.nextInt();
            if (n!=0){
                System.out.println("toplamları:" + (toplam=toplam+n));
            }else{
                System.out.print("0 dışında sayı giriniz");
                break;
            }
        }

    }
}
