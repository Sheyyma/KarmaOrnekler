import java.util.Scanner;
public class exp9 {
    //klavyeden girilen bir sayıyı pozitif tam sayı kabul ederek bu sayı ile 1000 arasındaki asal sayıları bulup ekrana yazan
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("bir sayı giriniz:");
        int sayi = input.nextInt();
        while(sayi!=1000){
            for(int i=2;i<sayi;i++){
                if(sayi%i!=0){
                    System.out.println(sayi);
                    break;
                }
            }
            sayi++;
        }

    }
}
