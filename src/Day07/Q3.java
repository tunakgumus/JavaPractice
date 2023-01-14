package Day07;

import java.util.Arrays;

public class Q3 {
    public static void main(String[] args) {
        //         Parametre olarak String bir isim girdiginiz, size o ismin harflerini
        //         bir char Array olarak yazdiran bir method olusturunuz.
        //         toCharArray() methodunu kullanmayiniz!
        //         * Input : John
        //         * Output : [J, o, h, n]
        String str = "Jhon";
        isminHarfleri(str);
    }
    public static void isminHarfleri (String arr) {
        char [] harfler =new char[arr.length()];
        for (int i = 0; i <arr.length() ; i++) {
            harfler[i]=arr.charAt(i);
        }
        System.out.println(Arrays.toString(harfler));
    }
}
