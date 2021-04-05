package recursion;

import java.util.Scanner;

public class Factorial {

    /*求n的阶乘*/

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int number = in.nextInt();

        int re = Query_Factorial(number);

        System.out.println(re);

    }

    private static int Query_Factorial(int number) {

        if (number==1){
            return 1;
        }

        return number*Query_Factorial(number-1);
    }
}
