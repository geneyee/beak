package step4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class _10_Q_1546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 과목 개수
        double[] arr = new double[N];

        // 점수 입력
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextDouble();
        }
        Arrays.sort(arr); // 최대값 arr[N-1]

        // 점수조작
        for (int i = 0; i < N; i++) {
            arr[i] = arr[i] / (double)arr[N - 1] * 100;
        }

        // 평균구하기
        double sum = 0;
        double avg = 0;
        for (int i = 0; i < N; i++) {
            sum += arr[i];
        }
        avg = sum/N;
        System.out.println(avg);

    }
}
