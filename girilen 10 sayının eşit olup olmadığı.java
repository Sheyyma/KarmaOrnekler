import java.util.Scanner;
public class exp1  {
    //girilen 10 sayının eşit olup olmadığı

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int ilksayi,sayi;
        System.out.print("birinci sayıyı giriniz:");
        ilksayi= input.nextInt();

        for ( int i=1 ; i<=10 ; i++){
            System.out.print(i+1+ ". sayınızı giriniz:");
            sayi= input.nextInt();

            if (ilksayi != sayi){
                System.out.println("sayılar eşit değildir");
                break;
            }
                System.out.println("sayılar eşittir");
            }
        }




    }
