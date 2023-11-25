import java.util.Scanner;
public class h32 {
    //String ayırma
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        String cumle;
        int satir;
        System.out.print("bir cümle giriniz:");
        cumle= input.nextLine();
        System.out.print("kaç satır ayrılacak:");
        satir= input.nextInt();
        int sayac=0;
        for(int i=0; i<=cumle.length()-satir; i++){
            System.out.println(cumle.substring(i, i+satir));


        }

    }
}
