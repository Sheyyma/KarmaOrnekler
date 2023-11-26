public class exp12 {
    //1,3,7,9,13,15.19,21 serinin ilk 100 teriminin toplamı bulan
    // +2 +4
    public static void main(String[] args) {
        int terim=1;;
        int toplam=0;
        for (int i =0 ; i<100 ; i++) {
            System.out.print(terim+ ",");
            if (i%2==0){
                terim+=4;
            }else{
                terim+=2;
            }

        }




        }

    }

