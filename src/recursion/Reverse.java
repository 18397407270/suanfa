package recursion;

import java.util.Scanner;

/*递归反转一个字符串*/
public class Reverse {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String s = in.next();

        int end = s.length();

        String re = reverse(s,end);

        System.out.println(re);
    }

    private static String reverse(String s,int end) {

        if(end==0){

            return "";
        }

        return s.charAt(end-1)+reverse(s,end-1);
    }
}
