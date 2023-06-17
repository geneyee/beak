package step2;

import java.util.Scanner;

public class _4_Q_14681 {
    public static void main(String[] args) {
        // 1사분면 (양수,양수)
        // 2사분면 (음수, 양수)
        // 3사분면 (음수, 음수)
        // 4사분면 (양수, 음수)

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        if (x > 0 && y > 0) {
            System.out.println(1);
        } else if (x < 0 && y > 0) {
            System.out.println(2);
        } else if (x < 0 && y < 0) {
            System.out.println(3);
        } else if (x > 0 && y < 0) {
            System.out.println(4);
        }
    }
}
