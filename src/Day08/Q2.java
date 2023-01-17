package Day08;

import java.util.ArrayList;
import java.util.List;

public class Q2 {
    public static void main(String[] args) {
       //Fibonacci yazdir
        fibonacciYazdir(9);
    }
    private static void fibonacciYazdir(int i) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        int sayi1 = 1;
        int sayi2 = 1;
        int sayi3=0;
        if(i==1) System.out.println("1");
        if(i==2) System.out.println("1,1");
        else {
            for (int j = 2; j <=i ; j++) {
                sayi3=sayi1+sayi2;
                list.add(sayi3);
                sayi1=sayi2;
                sayi2=sayi3;
            }
            System.out.println(list);

        }
    }
}
