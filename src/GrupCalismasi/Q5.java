package GrupCalismasi;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Q5 {
    public static void main(String[] args) {
        //ABD'deki eyalet kısaltmalarının biçimini kontrol etmek için kod yazınız.
        // a) Kısaltma 2'den fazla karakter içeriyor ise kodunuz,
        // "Eyalet kısaltmaları 2 karakterden fazla olamaz" yazmalıdır.
        // b) Kısaltmada küçük harfler var ise kodunuz, "Eyalet kısaltmaları küçük harf içeremez" yazmalıdır.
        // c) Kısaltmanın harflerinden farklı karakterler var ise kodunuz,
        // "Eyalet kısaltmaları aşağıdakilerden farklı karakterler içeremez" yazmalıdır.

        Scanner scan = new Scanner(System.in);
        System.out.println("bir kisaltma giriniz");
        String kislatma = scan.next();

        if(kislatma.length()>2) System.out.println("2 karakterden fazla olamaz");
        if(!kislatma.equals(kislatma.toUpperCase())) System.out.println("küçük harf içeremez");
        if (!Pattern.matches("^[A-Za-z ]*$",kislatma)) System.out.println("farklı karakterler içeremez");

    }
}
