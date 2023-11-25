//Klavyeden girilen metin içerisindeki boşluk
//karekterlerinin sayısını bulan program
import java.util.Scanner;
public class h45 {
   public static void main(String[] args) {
      Scanner input= new Scanner(System.in);
      System.out.print("bir metin giriniz:");
      String metin= input.nextLine();
      int sayac=0;
      for(int i=0; i<metin.length();i++){
         if(metin.charAt(i)==' '){
            sayac++;

         }
      }
      System.out.println(sayac);







   }

}
