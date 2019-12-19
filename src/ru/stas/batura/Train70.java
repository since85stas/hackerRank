package ru.stas.batura;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import java.util.Optional;

public class Train70 {
    public static void main(String[] args) {
//        birthdayCakeCandles(new int[] {3, 2, 1, 3});
//        timeConversion("12:00:00AM");
//        extraLongFactorials(99);
        appendAndDelete("aaa", "a", 5);
    }

    // Complete the birthdayCakeCandles function below.
    static int birthdayCakeCandles(int[] ar) {
         int max = Arrays.stream(ar).max().getAsInt();
         long count = Arrays.stream(ar).filter(i -> i == max).count();
         return (int)count;
    }


    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {
        /*
         * Write your code here.
         */
        String timeStr = s.substring(0,s.length()-2);
        String[] timeStrs = timeStr.split(":");
        int hour = Integer.parseInt(timeStrs[0]);
        int min = Integer.parseInt(timeStrs[1]);
        int sec = Integer.parseInt(timeStrs[2]);

        if (s.substring(s.length()-2,s.length()).equals("AM")) {
            System.out.println();
            if ( hour == 12) hour -= 12;
        }else {
            hour += 12;
            System.out.println();
            if (hour == 24) hour =0;
        }
        String hourStr = (hour > 9) ? String.valueOf(hour) : "0" + String.valueOf(hour);
        String minStr = (min > 9) ? String.valueOf(min) : "0" + String.valueOf(min);
        String secStr = (sec > 9) ? String.valueOf(sec) : "0" + String.valueOf(sec);
        return hourStr + ":" + minStr + ":" + secStr;
    }


    // Complete the extraLongFactorials function below.
    static void extraLongFactorials(int n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= n; i++)
            result = result.multiply(BigInteger.valueOf(i));
        System.out.print(result);

    }

//    You have a string of lowercase English alphabetic letters. You can perform two types of operations on the string:
//    Append a lowercase English alphabetic letter to the end of the string.
//    Delete the last character in the string. Performing this operation on an empty string results in an empty string.
//    Given an integer, , and two strings,  and , determine whether or not you can convert  to  by performing exactly
//    of the above operations on . If it's possible, print Yes. Otherwise, print No.
    // Complete the appendAndDelete function below.
static String appendAndDelete(String s, String t, int k) {
    if (s.length() - t.length() > k) {
        System.out.println("No");
        return("No");
    }
    if ( ! (s.length() <= t.length())) {
        String buf = s;
        s = t;
        t = buf;
    }
    int i;
    for ( i = 0; i < s.length(); i++) {
        if ( !( s.charAt(i) == t.charAt(i) ) ) {
            String subS = s.substring(i);
            String subT = t.substring(i);
            if (subS.length() > subT.length()) {
                boolean b = checkTransform(subT,subS,k);
                if (b) return("Yes");
                else return("No");
            } else {
                boolean b = checkTransform(subS,subT,k);
                if (b) return("Yes");
                else return("No");
            }
        }
    }
    if (s.charAt(0) == t.charAt(t.length()-1) && s.length() != t.length() && s.length() == 1) {
        boolean bb = checkTransform("",t.substring(i),--k);
        if (bb) return("Yes");
        return("No");
    }
    if ( i != t.length()) {
        boolean bb = checkTransform("",t.substring(i),k);
        if (bb) return("Yes");
        return("No");
    }
    return "Yes";
}

    // s <= t length
    static boolean checkTransform(String s, String t, int k) {
        int len = s.length() + t.length();
        if (s.length() > 0) {
            if (t.charAt(t.length()-1) == s.charAt(0) ) {
                len --;
            }
        }
        if (k < len) return false;
        else {
            if ( k == len ) {
                return true;
            }
            if ( (k % len)%2 == 0 && k> 1 && len> 1) {
                return true;
            } else {
                return false;
            }
        }
    }
}
