package Day08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q1 {
    public static void main(String[] args) {
        //verilen bir arrayin elemanlarinin ardasik toplamini hesaplayan methodu yazin
        //input ={3,5,1,2,7,9,2,3,5,7}
        //output={3,5+1,2+7+9,2+3+5+7
        int[] arr = {3, 5, 1, 2, 7, 9, 2, 3, 5, 7};
        int[] arr2 = new int[4];
        int toplam = 0;
        int sayac = 0;
        int indexAra = 1;
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j <= sayac; j++) {
                toplam += arr[indexAra - 1 + j];
            }
            arr2[i]=toplam;
            sayac++;
            toplam=0;
            indexAra +=sayac;
        }
        System.out.println(Arrays.toString(arr2));
    }
}
