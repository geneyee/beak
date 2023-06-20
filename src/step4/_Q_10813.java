package step4;

import java.util.Arrays;
import java.util.Scanner;

public class _Q_10813 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        // 바구니 초기화
        int[] arr = new int[N];
        for(int i = 1; i<= N; i++){
            arr[i-1] = i;
        }

        // 공 바꾸기
        for (int m = 0; m < M; m++) {
            int i = sc.nextInt();
            int j = sc.nextInt();

            int tmp = 0;
            tmp = arr[i-1];
            arr[i-1] = arr[j-1];
            arr[j-1] = tmp;
        }

        // 출력
        for(int num : arr){
            System.out.print(num+" ");
        }

    }
}
