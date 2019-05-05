package reverse;

import java.util.*;
import java.io.*;

public class Reverse {

    public static String FirstReverse(String str) {
        String[] str1 = str.split("");
        String[] strRev = new String[str1.length];

        int j = 0;
        for (int i = str1.length - 1; i >= 0; i--) {

            strRev[j] = str1[i];
            j += 1;
        }
        String str2 = String.join("", strRev);
        return str2;

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print(FirstReverse(s.nextLine()));
    }

}
