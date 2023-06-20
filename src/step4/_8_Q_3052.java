package step4;

import java.util.Scanner;

public class _8_Q_3052 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[10];

        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
            num[i] %= 42;
        }

        int count = 0;

        for (int i = 0; i < num.length; i++) { //10

        }
        System.out.println(count);

    }
}
