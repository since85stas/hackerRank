package ru.stas.batura;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalLong;

public class Main {

    public static void main(String[] args) {
        miniMaxSum(new int[] {1, 2, 3, 4, 5});
    }

    public static int diagonDiffer(List<List<Integer>> arr) {
        int i, j;
        int sum1 = 0;
        int sum2 = 0;
        for (i = 0, j = 0; i < arr.size() && j < arr.get(0).size(); i++, j++) {
            sum1 += arr.get(i).get(j);
        }
        for (i = arr.size() -1, j = 0; (i > -1) && (j < arr.get(0).size()); i--, j++) {
            sum2 += arr.get(i).get(j);
        }
        return Math.abs(sum1-sum2);
    }


    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
        long more = Arrays.stream(arr).filter(i -> i > 0).count();
        long less = Arrays.stream(arr).filter(i -> i < 0).count();
        long equal = Arrays.stream(arr).filter(i -> i == 0).count();

        System.out.printf("%.6f",(float) more/arr.length);
        System.out.print("\n");
        System.out.printf("%.6f",(float) less/arr.length);
        System.out.print("\n");
        System.out.printf("%.6f",(float) equal/arr.length);
    }


    // Complete the staircase function below.
    static void staircase(int n) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ( j > n - i -2) {
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }


    // Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) {
        long sum[] = new long[5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if ( j != i) {
                    sum[i] += arr[j];
                }
            }
        }
        OptionalLong max = Arrays.stream(sum).max();
        OptionalLong min = Arrays.stream(sum).min();
        System.out.print(min.getAsLong());
        System.out.print(" ");
        System.out.print(max.getAsLong());
    }
}
