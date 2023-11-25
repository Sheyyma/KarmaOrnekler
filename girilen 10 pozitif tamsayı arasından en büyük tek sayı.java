import java.util.Scanner;
public class h43 {
    //Klavyeden girilen 10 pozitif tamsayı arasından
//en büyük tek sayıyı bulan program
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
int eb=0;;
        for (int i=0; i<10; i++){
            System.out.print("bir sayı giriniz:");
            int n= input.nextInt();
            if((n%2!=0)&& (eb<n)){
                eb=n;


            }if (eb!=0){
                System.out.println("en büyük tek sayı"+ eb);
            }else{
                System.out.println("tek sayı girilmemiştir");
            }

    }
}}
