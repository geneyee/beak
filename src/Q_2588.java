import java.util.Scanner;

public class Q_2588 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.println(num * (num2 % 10));
        System.out.println(num * ((num2 / 10) % 10));
        System.out.println(num * (num2 / 100));
        System.out.println(num * num2);


    }
}
