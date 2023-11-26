import java.sql.SQLOutput;
import java.util.Scanner;
public class r1r2 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        double R1,R2,R3,R, deger;
        System.out.print("R1 giriniz:");
        R1= input.nextDouble();
        System.out.print("R2 giriniz:");
        R2= input.nextDouble();
        System.out.print("R3 giriniz:");
        R3= input.nextDouble();

        deger =1/R1+ 1/R2 + 1/R3;
        R= 1/deger;
        System.out.print(R);


    }
}
