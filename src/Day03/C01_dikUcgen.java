package Day03;

import java.util.Scanner;

public class C01_dikUcgen {
    public static void main(String[] args) {
        //Kenar uzunluklari aldiginiz ucgenin dik ucgen olup olmadigini kontrol ediniz
        Scanner scan = new Scanner(System.in);
        System.out.println("Ücgenin kenar uzunluklarini giriniz");
        double kenar1 = scan.nextDouble();
        double kenar2 = scan.nextDouble();
        double kenar3 = scan.nextDouble();

        if (kenar1>kenar2 && kenar1>kenar3){
            if (kenar1*kenar1==kenar2*kenar2 + (kenar3*kenar3)) System.out.println("Bu bir dik ucgendir");
            else System.out.println("Bu bir dik ucgen degildir");
        }
        if (kenar2>kenar1 && kenar2>kenar3){
            if (kenar2*kenar2==kenar1*kenar1 + (kenar3*kenar3)) System.out.println("Bu bir dik ucgendir");
            else System.out.println("Bu bir dik ucgen degildir");
        }
        if(kenar3>kenar2 && kenar3>kenar1){
            if (kenar3*kenar3==kenar2*kenar2 + (kenar1*kenar1)) System.out.println("Bu bir dik ucgendir");
            else System.out.println("Bu bir dik ucgen degildir");
        }
        System.out.println("-------------------------------2.Cozum-----------------------------");
        if (kenar3*kenar3==kenar2*kenar2 + kenar1*kenar1 || kenar2*kenar2==kenar3*kenar3 + kenar1*kenar1 || kenar1*kenar1==kenar2*kenar2 + kenar3*kenar3){
            System.out.println("Bu bir dik ucgendir");
        }else System.out.println("Bu bir dik ucgen degildir");

    }
}
