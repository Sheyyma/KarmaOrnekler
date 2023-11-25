import java.util.Scanner;
public class h24 {
    //en büyük sayı
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int x, y,z,eb;
        System.out.print("bir sayı giriniz:");
        x= input.nextInt();
        System.out.print("bir sayı giriniz:");
        y= input.nextInt();
        System.out.print("bir sayı giriniz:");
        z= input.nextInt();
        eb=x;
        if (y>eb){
            eb=y;
            System.out.println("en büyük:"+ eb);
        }if(z>eb){
            eb=z;
            System.out.println("en büyük:" + eb);
        }if (eb==x){
            eb=x;
            System.out.println("en büyük:" + eb);
        }

    }
}
