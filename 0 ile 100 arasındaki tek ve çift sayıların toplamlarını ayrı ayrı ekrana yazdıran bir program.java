public class h21 {
    // 0 ile 100 arasındaki tek ve çift sayıların toplamlarını ayrı ayrı ekrana yazdıran bir program:
    public static void main(String[] args) {
        int toplamcift=0;
        int toplamtek=0;

        for(int i=1; i<=100; i++){
            if(i%2==0){
             toplamcift=toplamcift+i;
            }else{
                toplamtek=toplamtek+i;

            }


        }
        System.out.println(toplamcift);
        System.out.println(toplamtek);

    }
}
