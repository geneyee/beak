package step3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _8_Q_11022 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for (int i = 1; i <= T; i++) {
            String str = br.readLine();
            sb.append("Case #").append(i).append(": ")
                    .append(str.charAt(0) - 48).append(" + ").append(str.charAt(2) - 48)
                    .append(" = ").append(str.charAt(0) - 48 + str.charAt(2) - 48).append("\n");
        }
        System.out.println(sb);

        br.close();
    }
}
