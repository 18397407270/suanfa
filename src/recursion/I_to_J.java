package recursion;

import java.util.Scanner;

/*题目描述:打印i到j(这里默认j大于等于i)*/
public class I_to_J {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int i = in.nextInt();

        int j = in.nextInt();

        Print_I_J(i,j);
    }

    private static void Print_I_J(int i, int j) {

        if(i>j) {
            return;
        }else {
            System.out.println(i);
            i++;
        }

        Print_I_J(i,j);
    }
}
