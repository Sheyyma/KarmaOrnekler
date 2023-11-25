// Faktoriyelli seri örneği
// 1/ 2! + 1/3! + 1/4! +...+ 1/10!
public class h47 {
    public static void main(String[] args) {
double fak=1.0;
double toplam=0.0;
for(int i=2; i<=10; i++){
    fak=fak*i;
    toplam=(double)(toplam+(1.0/fak));
    System.out.print(toplam+" ");
}
    }
}
