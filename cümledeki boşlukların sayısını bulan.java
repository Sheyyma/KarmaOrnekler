import java.util.Scanner;
public class h35 {
    //Bilgisayara girilen bir cümledeki boşlukların sayısını bulan bir Java programı
    //yazınız. İlk programınızı while deyimi ile ikincisini do…while deyimi ile yazınız.
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        String cumle;
        System.out.print("bir cümle giriniz:");
        cumle= input.nextLine();
        int i=0;
        int sayac=0;
        while(i<cumle.length()){

            if(cumle.charAt(i)==' '){
                sayac++;
            }
            i++;
        }
        System.out.println(sayac);
        input.close();

    }
}
