package step2;

import java.util.Scanner;

public class _3_Q_2753 {
    public static void main(String[] args) {
        // 윤년이면 1 아니면 0
        // 윤년 -> 4의 배수이면서 100의 배수가 아닐때 또는 400의 배수
        // (4의 배수) && !(100의 배수) || (400의 배수) -> 윤년
        // 2012 -> 4의 배수 true 100의 배수 false -> 윤년

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        // 조건
        System.out.println((num % 4 == 0) && (num % 100 != 0) || (num % 400 == 0) ? 1 : 0);
    }
}
