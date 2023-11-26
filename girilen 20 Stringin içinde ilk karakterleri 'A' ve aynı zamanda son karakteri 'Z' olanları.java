import java.util.Scanner;
public class exp10 {
    // klavyeden girilen 20 Stringin içinde ilk karakterleri 'A' ve aynı zamanda son karakteri 'Z' olanları
    // ekrana yazdıran program
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        String kelime;
        for (int i=1 ; i<=20 ; i++){
            System.out.print(i+ ". kelimeyi giriniz:");
            kelime= input.next();
            for (int j=0 ; j<kelime.length() ; j++ ){
                if((kelime.charAt(0)== 'A' ) && (kelime.charAt(j)== 'Z')){
                    System.out.println(kelime);
                }
            }




    }
}}
