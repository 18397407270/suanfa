package recursion;

import java.util.Scanner;

/*递归求最大公约数*/
public class Gcd {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int i = in.nextInt();
        int j = in.nextInt();

        int re = gcd(i,j);

        System.out.println(re);
    }

    private static int gcd(int i, int j) {

        if(j==0){

            return i;
        }
        return gcd(j,i%j);
    }
}
