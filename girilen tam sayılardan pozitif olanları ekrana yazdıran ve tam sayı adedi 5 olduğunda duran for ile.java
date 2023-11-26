import java.util.Scanner;
public class exp6 {
    //klavyeden girilen tam sayılardan pozitif olanları ekrana yazdıran ve tam sayı adedi 5 olduğunda duran program for
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int sayi;

        for(int i= 1; i<=5; i++){
            System.out.print("sayı giriniz:");
            sayi= input.nextInt();

            if(sayi>0){

                System.out.println("pozitif sayı:"+sayi);
            }
        }
        System.out.print("program bitti");
    }
}


