import org.w3c.dom.ls.LSOutput;

public class deneme19 {
    public static void main(String[] args) {
        String x= "aBC";
        String yeni ="";
        for (int i=0; i<x.length(); i++){
            if ((x.charAt(i)>='A') && (x.charAt(i)<='Z')){
                yeni= yeni + (char)(x.charAt(i)+32);

            }else{
                yeni= yeni + (char)(x.charAt(i));


        }}
        System.out.println(yeni);


}}