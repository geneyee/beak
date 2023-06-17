import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Q_2588 {
    public static void main(String[] args) throws IOException {
//        Scanner sc = new Scanner(System.in);

//        int num = sc.nextInt();
//        int num2 = sc.nextInt();

//        System.out.println(num * (num2 % 10));
//        System.out.println(num * ((num2 / 10) % 10));
//        System.out.println(num * (num2 / 100));
//        System.out.println(num * num2);

        // 입력받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 출력
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // 입력받은 문자열 " "로 자르기
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 토큰 String -> int
        int num = Integer.parseInt(st.nextToken());
        int num2 = Integer.parseInt(st.nextToken());

        // 출력
        System.out.println(num * (num2 % 10));
        System.out.println(num * ((num2 / 10) % 10));
        System.out.println(num * (num2 / 100));
        System.out.println(num * num2);

        System.out.println("---------------------------");

        // 출력2 bw.write() String이어야 함. int -> String
        bw.write(String.valueOf(num * (num2 % 10))+"\n");
        bw.write(String.valueOf(num * ((num2 / 10) % 10))+"\n");
        bw.write(String.valueOf(num * (num2 / 100))+"\n");
        bw.write(String.valueOf(num * num2));

        br.close();
        bw.flush();
        bw.close();



    }
}
