import java.util.Scanner;
public class h25 {
    // 3*x2 + 2*x + 5 denkleminin 0-100 arasındaki sonucunu bulun
    public static void main(String[] args) {
        int cevap=0;

        for(int i=0; i<=100; i++){
            cevap= 3*2*i+2*i+5;


            System.out.println(i+". için sonuç:"+ cevap);
        }

    }
}
