import java.util.Scanner;
public class h14 {
    // negatif sayı girilene kadar çalıştır
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int i=0;
        int sayi;
        while(i<8){
            System.out.print("bir sayı giriniz:");
            sayi= input.nextInt();
            if(sayi>=0){
                i++;
            }else{
                break;
            }



        }
    }
}
