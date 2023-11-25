import java.util.Scanner;
public class h41 {
    //Klavyeden girilen 1-15 arası sayının faktöriyelini hesaplayan java kodunu yazınız?
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("1-15 arası sayı giriniz:");
        int n=input.nextInt();
        int fak=1;
        int i;
        if((n>0)&& (n<16)){
            for( i=n; i>1; i--){
                fak*=i;

            }
            System.out.println(fak);
        }else{
            System.out.println("hatalı tuşlama yaptınız");

        }




    }
}
