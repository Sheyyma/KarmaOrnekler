public class d1 {
    // 2 4 8 10 14 16 ilk 100 terimin toplamı
    // 1.terim ilk+4
    // 3.terim ilk+4+6.1
    // 5.terim ilk+6.2
    // 99.terim 4+49.6
    public static void main(String[] args) {
        int terim=2;
       int  toplam=terim;

       for (int i=0; i<99;i++){
           if(i%2==0){
               terim= terim+2;

           }else{
               terim=terim +4;


           }
           toplam+=terim;

        }
        System.out.println(toplam);










    }

}
