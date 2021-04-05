package lanqiao;

import java.util.Arrays;

public class Lack_Number2 {

    /*
    * 从1到n中找出最小可用id
    * 1,2,3,5...n,最小可用id为4
    *
    * */

    public static void main(String[] args) {

        int a [] = {2,3,4,8,5,7,15,32};

        int re = FindNumber(a);

        System.out.println(re);
    }

    public static int FindNumber(int [] a){



        int b [] = new int[a.length+2];

        for (int i = 0; i < a.length; i++) {

            if(a[i]<=a.length)
            b[a[i]] = 1;
        }

        for (int i = 1; i <= a.length; i++) {

            if(b[i]==0){
                return i;
            }
        }

        return a.length+1;
    }
}
