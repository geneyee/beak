package step2;

import java.util.Arrays;
import java.util.Scanner;

public class _7_Q_2480 {
    public static void main(String[] args) {
        // 입력 : 1~6 3개 빈칸
        // 출력 게임의 상금
        // 같은 눈 3개-> 10000 +(같은 눈)*1000
        // 같은 눈 2개-> 1000+(같은 눈)*100
        // 모두 다른 눈 -> 가장 큰 눈*100

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int[] arr = {a, b, c};

        if (a == b && b == c && a == c) {
            System.out.println(10000 + a * 1000);
        } else if (a == b || b == c || a == c) {
            if (a == b || a == c) {
                System.out.println(1000 + a * 100);
            } else if (b == c) {
                System.out.println(1000 + b * 100);
            }
        } else if (a != b && b != c && a != c) {
            Arrays.sort(arr);
            System.out.println(arr[arr.length-1]*100);
        }

    }
}
