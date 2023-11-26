import java.util.Scanner;
public class deneme15 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int n;
        int carpim=1;
        System.out.print("bir sayı giriniz:");
        n= input.nextInt();
        for (int i=1; i<=n; i++){
            carpim= carpim*i;
            System.out.println(carpim);
        }
    }
}
