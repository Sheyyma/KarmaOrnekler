public class d3 {
    //1 den n e kadar asal sayı
    public static void main(String[] args) {
        for(int x=2; x<=20;x++){
        boolean AsalMi=true;
        for (int i=2; i<x; i++){
            if(x%i==0){
                AsalMi=false;
            }

        }
        if(AsalMi){
            System.out.println(x+" asaldır");
        }
        }
    }
}
