package GrupCalismasi;

import javax.print.DocFlavor;
import java.util.Arrays;

public class Q17 {
    public static void main(String[] args) {
        //Bir String’ de benzersiz(tekrarsız) karakterler yazdırmak için kod yazınız.
        //Örneğin; Hello ==> Heo
        String input = "Hello";
        String input2="";
        String [] arrInput=input.split("");
        for (int i = 0; i <input.length() ; i++) {
            if (Arrays.toString(arrInput).contains(arrInput[i])){
                input=input.replaceAll(arrInput[i],"");
            }

        }
        System.out.println(input);
        }

    }

