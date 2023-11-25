public class h22 {
    //While döngüsü kullanarak 0 ile 1000 arasında kaç tane tek, kaç tane çift sayı olduğunu bulup
    //ekrana yazdırınız:
    public static void main(String[] args) {
        int i=0;
        int c=0;
        int t=0;
        while(i<=1000){
            if(i%2==0){
                c++;
            }else{
                t++;
            }
            i++;
        }
        System.out.println("çift sayı sayısı:"+ c);
        System.out.println("tek sayı sayısı:"+ t);
    }
}
