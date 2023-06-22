package step4;

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
            int i = sc.nextInt(); // 1
            int j = sc.nextInt(); // 2

            for (int k = j-1; k >= i-1; k--) { // k=1 k >=0 k--
                //여기서 arr[k] 어떻게 저장할지...
            }
        }

        // 출력
        for (int n : arr)
            System.out.print(n+" ");
    }
}
