package lanqiao;

import java.util.Scanner;

public class 特别数的和 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int sum = 0;

        for (int i = 1; i <=n; i++) {

            String s = i+"";

            if(s.contains("1")||s.contains("2")||s.contains("0")||s.contains("9")){

                sum+=i;

            }

        }

        System.out.println(sum);
    }
}
