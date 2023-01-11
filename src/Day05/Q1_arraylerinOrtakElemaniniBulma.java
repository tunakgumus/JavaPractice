package Day05;

import java.util.Arrays;

public class Q1_arraylerinOrtakElemaniniBulma {
    public static void main(String[] args) {
        /*
    İki arrayin arasinda ayni olan elemanlari bir liste ekleyen program yazin
    input1 = {Jhon,Brad,Ange,Sofia,Emily}       input2={Sofia,brad,grace,emily,hazel}
    output= {Sofia,brad,emily}
     */
        String [] arr1 = {"Jhon","Brad","Ange","Sofia","Emily"};
        String [] arr2 = {"Sofia","brad","grace","emily","hazel"};
        int enUzunArrLength=arr1.length;
        if(arr2.length>arr1.length) enUzunArrLength=arr2.length;
        String []arr3 = new String[enUzunArrLength];
        int toplam=0;
        for (int i = 0; i < arr1.length ; i++) {
            for (int j = 0; j < arr2.length ; j++) {

                if (arr1[i].equalsIgnoreCase(arr2[j])){
                    arr3[toplam]=arr1[i];
                    toplam++;
                }
            }

        }

        String [] arr4 = new String[toplam];
        for (int i = 0; i < arr4.length ; i++) {
            arr4[i]=arr3[i];
        }
        System.out.println(Arrays.toString(arr4));
    }
}
