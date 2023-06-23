package step4;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class _9_Q_10811 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] arr = new int[N];

        // arr[] = { 1 2 3 4 5 }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }

        // M번 반복
        for (int m = 0; m < M; m++) {
            int i = sc.nextInt()-1; // 1
            int j = sc.nextInt()-1; // 2

            while (i < j) {
                int tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
                i++;
                j--;
            }

        }

        // 출력
        for (int n : arr)
            System.out.print(n + " ");
    }
}
