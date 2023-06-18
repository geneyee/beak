package step3;

import java.io.*;
import java.util.StringTokenizer;

public class _7_Q_11021 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        // 방법 1
        for (int i = 1; i <= T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            bw.write("Case #" + i + ": ");
            bw.write((A + B) + "\n");
        }

        // 방법 2
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= T; i++) {
            String str = br.readLine();
            sb.append("Case #").append(i).append(": ")
                    .append(str.charAt(0) - '0' + str.charAt(2) - '0').append("\n");
        } // -'0' || -48 -> charAt()은 char로 반환 -> [아스키 문자 -> 숫자로] 변환

        br.close();
        bw.flush();
        bw.close();
    }
}
