import java.util.Random;

public class Silben {
    public static void main(String[] args) {

        String[] arr={
                "aaa",
                "cd",
                "haho",
                "morgen",
                "croissant",
                "Paris",
                "asdfghjkl",
                "qwertzuiop",
                "m",
                "poiuztr",
                "lpawihedbcvn",
        };
        String neuerName = generiere(arr, 4);
        System.out.println(neuerName);
        neuerName = generiere(arr, 2);
        System.out.println(neuerName);
        neuerName = generiere(arr, 3);
        System.out.println(neuerName);
        neuerName = generiere(arr, 5);
        System.out.println(neuerName);
        neuerName = generiere(arr, 7);
        System.out.println(neuerName);
        neuerName = generiere(arr, 8);
        System.out.println(neuerName);
        neuerName = generiere(arr, 10);
        System.out.println(neuerName);
        neuerName = generiere(arr, 6);
        System.out.println(neuerName);

    }
    public static String generiere(String[] arr, int x){
        for(String s: arr){
           if( s.length()+1==x){
               Random rnd= new Random();
               String neuName=s.replace("a", "d");
               neuName=neuName.replace("m", "k");
               neuName=neuName.replace("e", "l");
               neuName=neuName.replace("p", "o");
               neuName=  neuName.substring(0,1).toUpperCase() + neuName.substring(1).toLowerCase();

               return neuName;
           }
        }return null;
    }

}
