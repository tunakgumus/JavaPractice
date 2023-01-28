package GrupCalismasi;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        //Aşağıdaki seçenekler doğrultusunda gereken kodu yazınız.
        // a) Son basamak 5 ‘e eşit ve 5 den büyükse, yuvarlama işlemi: “Son basamağı bir üst ondalığa yuvarla”
        // b) Son basamak 5 den küçükse, yuvarlama işlemi: “Son basamağı bir alt ondalığa yuvarla
        Scanner scan = new Scanner(System.in);
        System.out.println("bir sayı giriniz");
        int sayi = scan.nextInt();
        int sonBasamak= sayi%10 ;
        if (sayi%10>=5){
            sayi += 10-sonBasamak;
        }else{
            sayi -=sonBasamak;
        }
        System.out.println(sayi);
    }
}
