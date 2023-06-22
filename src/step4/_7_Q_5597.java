package step4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class _7_Q_5597 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        boolean[] arr = new boolean[31]; // 1<=n<=30이라서 boolean[30]하면 18줄에 에러..
        for (int i = 0; i < 28; i++) {
            int n = Integer.parseInt(br.readLine());
            arr[n] = true;
        }

        for (int i = 1; i <= 30; i++) {
            if(!arr[i])
                System.out.println(i);
        }

    }
}

