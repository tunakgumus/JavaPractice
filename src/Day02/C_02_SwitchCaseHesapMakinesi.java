package Day02;

import java.util.Scanner;

public class C_02_SwitchCaseHesapMakinesi {
    public static void main(String[] args) {
        //Kullanicidan 2 tam sayi ve islem cinsini alin, kullanicinin istediği islemi yaptirin
        Scanner scan =new Scanner(System.in);
        System.out.println("Lütfen 2 tam sayi ve isleminizi giriniz");
        int sayi1 = scan.nextInt();
        int sayi2 = scan.nextInt();
        char islem = scan.next().charAt(0);
        switch (islem) {
            case '+' :
                System.out.println("sayilarin toplami: " + (sayi2+sayi1));
            break;
            case '-' :
                System.out.println("sayilarin farki: " + (sayi2-sayi1));
                break;
            case '*':
                System.out.println("sayilarin carpimi: " + (sayi2*sayi1));
                break;
            case '/':
                System.out.println("sayilarin bolumu: " + (sayi2/sayi1));
                break;
        }


    }
}
