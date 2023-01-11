package Day05;

import java.nio.file.StandardOpenOption;

public class Q2_arraydakiSayilarinToplami {
    public static void main(String[] args) {
        //Create an array of 5 floats and calculate their sum
        float [] arr = {1.0f,2.0f,3.0f,4.0f,5.0f};
        float toplam =0;

        System.out.println("============for loop cozumu============");
        for (int i = 0; i < arr.length ; i++) {
            toplam +=arr[i];
        }
        System.out.println("for loop toplami: " + toplam);
        System.out.println("============while cozumu============");
        int index=0;
        toplam=0;
        while (index<arr.length){
                toplam +=arr[index];
                index++;
            }
        System.out.println("while toplami: " + toplam);
        }

    }
