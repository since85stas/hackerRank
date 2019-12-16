package ru.stas.batura;

import java.util.Arrays;
import java.util.Collections;

public class Train70 {
    public static void main(String[] args) {
//        birthdayCakeCandles(new int[] {3, 2, 1, 3});
        timeConversion("12:00:00AM");
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
}
