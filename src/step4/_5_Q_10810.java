package step4;

import java.util.Scanner;

public class _5_Q_10810 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] arr = new int[N];// 바구니 가지고 있는 배열

        // 공 넣기
        for (int n = 0; n < M; n++) {
            int i = sc.nextInt();
            int j = sc.nextInt();
            int k = sc.nextInt();
            for (int l = i-1; l <= j-1; l++) {
                arr[l] = k;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
