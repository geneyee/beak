import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Q_11382 {
    public static void main(String[] args) throws IOException {

//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c = sc.nextInt();
//
//        System.out.println(a + b + c);

//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String str = br.readLine();
//
//        StringTokenizer st = new StringTokenizer(str);
//        int sum=0;
//        while(st.hasMoreTokens()){
//            sum += Integer.parseInt(st.nextToken());
//        }
//        System.out.println(sum);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());
        long c = Long.parseLong(st.nextToken());

        bw.write(String.valueOf(a + b + c));

        br.close();
        bw.flush();
        bw.close();

    }
}
