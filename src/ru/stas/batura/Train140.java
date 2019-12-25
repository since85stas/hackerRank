package ru.stas.batura;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Train140 {
    public static void main(String[] args) {
//        kangaroo(0,3,4,2);
//        flatlandSpaceStations(6, new int[] {0, 1, 2, 4, 3, 5});
//        flatlandSpaceStations(5, new int[] {0, 4});
        countingValleys(6,"UDDDUDUU");
    }

    // Complete the kangaroo function below.
    static String kangaroo(int x1, int v1, int x2, int v2) {
        if (v2>=v1) return "No";

//        IntStream g1 = Stream.iterate(x1, i -> i+v1).limit(5).mapToInt(i -> i);
//        g1.forEach(System.out::println);
        int limit = (int) (x2-x1)/(v1-v2) + 1;
        int i =0;
        while (i<limit) {
            x1 += v1;
            x2 += v2;
            i++;
            System.out.println(x1 + " " + x2);
            if (x1 == x2 ) return "Yes";
        }
        return "No";
    }


    // Complete the flatlandSpaceStations function below.
//    Complete the flatlandSpaceStations function in the editor below.
//    It should return an integer that represents the maximum distance any city is from a space station.
//    flatlandSpaceStations has the following parameter(s):
//    n: the number of cities
//    c: an integer array that contains the indices of cities with a space station, -based indexing
    static int flatlandSpaceStations(int n, int[] c) {
        Arrays.sort(c);
        int[] answer = new int[n];
        int min = 0;
        for (int i = 0; i < n; i++) {
            int max = n;
            for (int j = 0; j < c.length; j++) {
                int abs = Math.abs(c[j] - i);
                if ( abs < max ) max = abs;
            }
            if (max > min) min = max;
        }
        return min;
    }


    // Complete the countingValleys function below.
    static int countingValleys(int n, String s) {
        int alt = 0;
        int valley = 0;
        boolean isBeyound = false;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'U') {
                alt++;
            } else {
                alt--;
            }
            if (i == 0) System.out.println("");
            else {
                if ( (alt == 0) && (isBeyound) ) {
                    valley++;
                }
            }
            if (alt > 0) isBeyound =false;
            else isBeyound = true;

        }
        return valley;
    }



}
