package step3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class _12_Q_10951 {
    public static void main(String[] args) throws IOException {

        // EOF : End of File

        // 방법 1
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            System.out.println(sc.nextInt()+ sc.nextInt());
        }

        // 방법 2 - 이렇게 하면 무한루프...
/*        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringTokenizer st;

        while (str != null) {
            st = new StringTokenizer(str);
            System.out.println(st.nextToken() + st.nextToken());
        }
        br.close();*/
    }
}
