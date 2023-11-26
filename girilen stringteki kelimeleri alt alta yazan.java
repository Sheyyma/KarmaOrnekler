import java.util.Scanner;
public class exp11 {
    // girilen stringteki kelimeleri alt alta yazan
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        String cumle;
        System.out.print("bir cümle giriniz:");
        cumle= input.nextLine();
        for(int i=0;i<cumle.length();i++){
            if (cumle.charAt(i)!=' '){
                System.out.print(cumle.charAt(i));
            }else{
                System.out.println();

            }
        }
    }
}
