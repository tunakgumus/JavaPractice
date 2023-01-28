package Day10;

import java.util.Random;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        //taş kağıt makas oyunu
        //oyun bilgisayar ile oynanacak
        //biz değer girelim klavyeden bilgisayar random seçim yapsın
        //ekrana 5 puana ilk ulaşan oyunu kazanır
        int pc=0;
        int user=0;
        int yuksekSkor=0;
        int userSkor=0;
        int pcSkor=0;
        Scanner scan= new Scanner(System.in);
        for (int i = 0; i<100 ; i++) {
            System.out.println("Bir secim yapiniz: " +
                    "\n1= tas" +
                    "\n2= kagit" +
                    "\n3= makas");
            user= scan.nextInt();
            if(user<=0 || user>=4){
                System.out.println("gecersiz giris");
            }
            Random rnd =new Random();
            pc =rnd.nextInt(3)+1;
            System.out.println(pc);

            if (pc==user) System.out.println("berabere");
            if (pc==1){
                if(user==2){
                    pcSkor++;
                    System.out.println("pc kazandı. Skor pc: " + pcSkor + " user: " + userSkor);
                }
                if(user==3){
                    userSkor++;
                    System.out.println("user kazandı. Skor pc: " + pcSkor + " user: " + userSkor);
                }
                if(userSkor>=pcSkor){
                    yuksekSkor=userSkor;
                }else yuksekSkor=pcSkor;
                if(yuksekSkor==5)break;
            }
            if (pc==2){
                if(user==1){
                    userSkor++;
                    System.out.println("user kazandı. Skor pc: " + pcSkor + " user: " + userSkor);
                }
                if(user==3){
                    pcSkor++;
                    System.out.println("pc kazandı. Skor pc: " + pcSkor + " user: " + userSkor);
                }
                if(userSkor>=pcSkor){
                    yuksekSkor=userSkor;
                }else yuksekSkor=pcSkor;
                if(yuksekSkor==5)break;
            }
            if (pc==3){
                if(user==1){
                    userSkor++;
                    System.out.println("user kazandı. Skor pc: " + pcSkor + " user: " + userSkor);
                }
                if(user==2){
                    pcSkor++;
                    System.out.println("pc kazandı. Skor pc: " + pcSkor + " user: " + userSkor);
                }
                if(userSkor>=pcSkor){
                    yuksekSkor=userSkor;
                }else yuksekSkor=pcSkor;
                if(yuksekSkor==5)break;
            }
        }
        if(user==5) System.out.println("User maci kazandi");
        else System.out.println("pc maci kazandi");
    }
}
