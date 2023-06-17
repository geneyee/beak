package step2;

import java.util.Scanner;

public class _5_Q_2884 {
    public static void main(String[] args) {
        // 입력 -> 상근시간 (H M)
        // 출력 -> 상근이가 창영이의 방법 사용할 떄 설정해야 하는 알람 시간
        // 창영 -> 원래시간보다 45분 빠르게

        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int M = sc.nextInt();

//        if (M - 45 < 0) {
//            H--;
//            if(H < 0){
//                H += 24;
//            }
//            M = (M + 60) - 45;
//        }
//        System.out.printf("%d %d",H,M);
        // 틀린 이유 m>45 일때 안적어줘서..?

        if (M < 45) {
            H--;
            M += 15;
            if (H < 0) {
                H = 23;
            }
            System.out.println(H + " " + M);
        } else {
            M -= 45;
            System.out.println(H + " " + M);
        }
    }
}
