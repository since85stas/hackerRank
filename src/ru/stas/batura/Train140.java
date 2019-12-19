package ru.stas.batura;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Train140 {
    public static void main(String[] args) {
        kangaroo(0,3,4,2);
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
}
