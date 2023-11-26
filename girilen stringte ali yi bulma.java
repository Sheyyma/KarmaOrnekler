import java.util.Scanner;
public class exp4 {
    // klavyeden girilen kelimede ali bulma
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        String kelime;
        System.out.print("bir kelime giriniz:");
        kelime= input.next();
        for(int i =0 ; i<= kelime.length() ; i++){
            if ((kelime.charAt(i)== 'a') || (kelime.charAt(i)=='A'))
                if ((kelime.charAt(i+1)== 'l') || (kelime.charAt(i+1)=='L'))
                    if ((kelime.charAt(i+2)=='i') || (kelime.charAt(i+2)== 'İ')){

                        System.out.println("ali saptandı");
System.exit(0);
    }else{
                        System.out.println("ali bulunamadı");
                    }
}}}
