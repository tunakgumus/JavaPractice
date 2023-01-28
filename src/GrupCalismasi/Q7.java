package GrupCalismasi;

import java.util.ArrayList;
import java.util.List;

public class Q7 {
    public static void main(String[] args) {
        int sayi = 123321;
        String sayiStr=""+sayi;
        List<String> sayiList = new ArrayList<>();
        List<String> sayiList2 = new ArrayList<>();

        for (int i = 0; i <sayiStr.length(); i++){
            sayiList.add((sayiStr.substring(i,i+1)));
            }
        for (int i = sayiList.size()-1; i >=0 ; i--) {
            sayiList2.add(sayiList.get(i));
        }
        if(sayiList.equals(sayiList2)) System.out.println("Palindromedur");
    }
    }

