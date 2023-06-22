package step4;

import java.util.HashSet;
import java.util.Scanner;

public class _8_Q_3052 {
    public static void main(String[] args) {
        // HashSet은 중복값 저장 xx
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> h = new HashSet<Integer>();

        for (int i = 0; i < 10; i++) {
            h.add(sc.nextInt()%42);
        }
        sc.close();
        System.out.println(h.size());
    }
}
