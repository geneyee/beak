package step2;

import java.util.Scanner;

public class _1_Q_1330 {
    public static void main(String[] args) {
        // a b 비교
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a > b ? ">" : a < b ? "<" : "==");

    }
}
