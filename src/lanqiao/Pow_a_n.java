package lanqiao;

import java.util.Scanner;

/**
 * 求a的n次幂
 */
public class Pow_a_n {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int a = in.nextInt();

        int n = in.nextInt();

        int re = pow(a,n);
        int re1 = pow1(a,n);

        System.out.println(re);

        System.out.println(re1);
    }

    private static int pow1(int a, int n) {

        if(n==0){
            return 1;
        }

       if (n == 1) {

            return a;
        }

        int res = a;

        int ex = 1;

        while ((ex<<1)<=n){

            res = res*res;

            ex = ex<<1;

        }

        return res*pow1(a,n-ex);
    }

    private static int pow(int a, int n) {

        int res = 1;

        for (int i = 0; i < n; i++) {

            res *= a;
        }

        return res;
    }
}
