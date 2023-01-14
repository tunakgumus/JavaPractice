package Day07;

import java.util.Arrays;

public class Q1 {
    public static void main(String[] args) {
       char [][] harfler = new char[3][4];
       harfler [0][0] = 'a';
       harfler [0][1]  = 'b';
       harfler [0][2] = 'c';
       harfler [0][3] = 'd';

        System.out.println(Arrays.toString(harfler));
        System.out.println(Arrays.deepToString(harfler));
        System.out.println(harfler[0][2]);
    }
}
