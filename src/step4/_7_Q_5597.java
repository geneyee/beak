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

        int[] arr = new int[28];
        ArrayList<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        for (int i = 1; i <= arr.length-1; i++) {
            if(!contains(arr, i))
                list.add(i);
        }

        Collections.sort(list);

        for(int n : list)
            System.out.println(n);

        br.close();
    }

    public static boolean contains(int[] arr, int key) {
        return Arrays.stream(arr).anyMatch(i -> i == key);
    }
}

