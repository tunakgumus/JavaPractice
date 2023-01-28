package GrupCalismasi;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        //Verilen BMI değerleri için Vücut Kitle İndeksi (BMI) ile ilgili mesajları yazdırmak için kod yazınız.
        // Geçersiz BMI değeri < 0 Zayıf = <18.5 Normal ağırlık = 18.5–24.9
        // Fazla kilolu = 25–29.9 Obezite = 30 veya daha büyük BMI

        Scanner scan = new Scanner(System.in);
        System.out.println("VKI giriniz");
        double index = scan.nextDouble();

        if (index<0) System.out.println("gecersiz");
        else if (index<=18.5) System.out.println("Zayıf");
        else if (index<=24.9) System.out.println("Orta");
        else if (index<=29.9) System.out.println("Kilolu");
        else System.out.println("Obezite");

    }
}
