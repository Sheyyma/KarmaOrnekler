import java.util.Scanner;
public class deneme13 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        String a;
        System.out.print("bir ifade giriniz:");
        a= input.nextLine();

        int karakter;
        System.out.print("kaç karakter ayırsın:");
        karakter= input.nextInt();

        for(int i=0; i<=a.length();i++){
        System.out.println(a.subSequence(i,i+karakter));

    }
}}
