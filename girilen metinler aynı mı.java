import java.util.Scanner;
public class deneme9 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
String a,b;
        System.out.print("bir metin giriniz:");
a= input.nextLine();
        System.out.print("bir metin giriniz:");
b= input.nextLine();

if (a.equals(b)){
    System.out.println("girilen metinler aynıdır");
}else{
    System.out.println("girilen metinler farklıdır");
}
    }
}
