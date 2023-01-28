package GrupCalismasi;

public class Q13 {
    public static void main(String[] args) {
        //Bir String’ i tersine çevirmek için kod yazınız. Örnek; Mark ==> kraM
        String input= "Mark";
        String tersten="";
        for (int i = input.length()-1; i >=0 ; i--) {
            tersten +=input.substring(i,i+1);
        }
        System.out.println(tersten);
    }


}
