import java.util.Scanner;
public class h31 {
    //Aşağıdaki kodu bir dizgide sesli olmayan harflerin sayısını bulacak
    //şekilde tamamlayınız?
    //Bir dizgideki sesli harfler a, e, i, o, u veya A, E, I, O, U olabilir.
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
       String a= "şeyma nasilsin";
       int sessiz=0;
       int sayac=0;
        for(int i=0; i<a.length(); i++){
            char b= a.charAt(i);
            if((b=='a') || (b=='e') || (b=='i')|| (b=='o')|| (b=='u') || (b==' ')){
             sayac++;
            }

        }
        sessiz= a.length()-sayac;
        System.out.println(sessiz);
    }
}
