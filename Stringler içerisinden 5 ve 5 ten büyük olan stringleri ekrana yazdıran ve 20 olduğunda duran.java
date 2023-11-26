import java.util.Scanner;
public class exp2 {
    //Klavyeden girilen Stringler içerisinden 5 ve 5 ten büyük olan stringleri ekrana yazdıran ve 20 olduğunda duran
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        String karakter;

        for (int i=1 ; i<=20 ; i++){
            System.out.print(i+ ". kelimenizi giriniz:");
            karakter= input.next();

            if (karakter.length()>=5){
                System.out.println(karakter);

            }

        }

        System.out.print("20 giriş hakkınız doldu");


    }
}
