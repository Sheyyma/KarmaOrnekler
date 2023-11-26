import java.util.Scanner;
public class deneme7 {
    public static void main(String[] args) {
        int not;
        Scanner input= new Scanner(System.in);
        boolean gecerliMi=false;
        while(!gecerliMi) {
            gecerliMi = true;
            System.out.print("not giriniz : ");
            not = input.nextInt();
            if ((not <= 100) && (not >= 90)) {
                System.out.println("AA");
            } else if ((not < 90) && (not >= 80)) {
                System.out.println("BA");
            } else if ((not < 80) && (not >= 75)) {
                System.out.println("BB");
            } else if ((not < 75) && (not >= 70)) {
                System.out.println("CB");
            } else if ((not < 70) && (not >= 60)) {
                System.out.println("CC");
            } else if ((not < 60) && (not >= 50)) {
                System.out.println("DC");
            } else if ((not < 50) && (not >= 0)) {
                System.out.println("FF");
            } else {
                gecerliMi = false;
                System.out.print("geçerli bir sayı giriniz: ");
            }
        }

        }
}

