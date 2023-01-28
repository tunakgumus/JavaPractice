package GrupCalismasi;

public class Q10 {
    public static void main(String[] args) {
        //String içindeki tüm küçük harfleri yıldız işaretiyle yazdırmak için gereken kodu yazınız.
        //Örneğin; 'Ali Can?' ==> l*i*a*n
        String input = "Ali Can";
        String input1 = "";
        input = input.replace(" ", "");
        for (int i = 0; i < input.length(); i++) {

            if (input.substring(i, i + 1).equals(input.substring(i, i + 1).toLowerCase())) {
                System.out.print(input.charAt(i) + "*");
            }
        }
    }
}
