package Day06;

import java.sql.Array;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        //Girilen string bir ifadenin içindeki sayısal degerleri toplayan bir method yaziniz
        Scanner scan = new Scanner(System.in);
        System.out.println("Cumle giriniz");
        String str = scan.nextLine();
        System.out.println(stringIfadeDegerleriniToplama(str));
    }

    public static int stringIfadeDegerleriniToplama(String str) {
        int toplam = 0;
        int sayi = 0;
        String[] arr = str.split("");
        for (String each : arr) {
            if (Character.isDigit(each.charAt(0))) {
                toplam += Integer.valueOf(each);
            }
        }
        return toplam;
    }
}
