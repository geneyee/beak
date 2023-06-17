package step2;

import java.util.Scanner;

public class _6_Q_2525 {
    public static void main(String[] args) {
        // 오븐구이 끝나는 시간 계산
        // 입력 : 요리 시작하는 시각, 필요한 시간

        // 시
//        int A = 17;
//        // 분
//        int B = 40;
//
//        // 소요시간
//        int C = 80;

        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

/*
        if (B + C >= 60) {
            B = (B + C) - 60;
            A++;
            if (B == 60) {
                B = 0;
                A++;
            }
            if (A == 24) {
                A = 0;
            }
            System.out.println(A + " " + B);
        } else if (B + C < 60) {
            B = B + C;
            System.out.println(A + " " + B);
        }
*/
        // 필요한 시간의 입력 조건이 0 <= C <= 1000 인거 유의

        int result = 60 * A + B; // A시 B분 -> 분으로 변환
        result += C; // 요리시간 더하기

        int hour = (result / 60) % 24;
        int min = result % 60;

        System.out.println(hour + " " + min);
    }
}
