package GrupCalismasi;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        //Mili km'ye, saniyeyi saate, fahrenhaytı santigrata çeviren bir dönüştürücü oluşturmak için kod yazınız.
        // Google'dan dönüşümler için formülleri bulunuz.
        // a) Kullanıcı mile değerini 10 ve operatorü mildenKmye olarak girdiğinde,
        // konsolda kodunuz "16 km" yazmalıdır (sayı dinamik olacak)
        // b) Kullanıcı saniye değerini 7200 ve operatorü saniyedenSaate olarak girdiğinde,
        // konsolda kodunuz "2" yazmalıdır (sayı dinamik olacak)
        // c) Kullanıcı fahrenheit değerini 83 ve operatorü fahrenaytdanSantigarata olarak girdiğinde,
        // konsolda kodunuz "28.3333 santigrat" yazmalıdır (sayı dinamik olacak)

        Scanner scan = new Scanner(System.in);
        System.out.println("Donusturmek istediginiz islemi seciniz" +
                "\n1-Mil" +
                "\n2-Saat" +
                "\n3-Fahrenayt");
        int sayi = scan.nextInt();
        if (sayi>=4 || sayi<=0){
            System.out.println("gecersiz islem");
        }

        if(sayi==1){System.out.println("islemin degerini giriniz");
            int deger = scan.nextInt();
            deger *= 1.6;
            System.out.println( "istenen deger" + deger + "kmdir");
        }
        else if(sayi==2){System.out.println("islemin degerini giriniz");
            int deger = scan.nextInt();
            deger *= 60*60;
            System.out.println( "istenen deger" + deger + "sndir");
        }
        else if(sayi==3){System.out.println("islemin degerini giriniz");
            int deger = scan.nextInt();
            deger *= 5;
            System.out.println( "istenen deger" + deger + "derecedir");
        }
    }
}
