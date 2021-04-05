package lanqiao;

import java.util.Arrays;

public class Lack_Number {

    /*
    * 从1到n中找出最小可用id
    * 1,2,3,5...n,最小可用id为4
    *
    * */

    public static void main(String[] args) {

        int a [] = {1,2,3,6,5,7,10,67};

        int re = FindNumber(a);

        System.out.println(re);
    }

    public static int FindNumber(int [] a){

        Arrays.sort(a);

        int i = 0;

        while (i<a.length){

            if(i+1!=a[i]){

                return i+1;

            }
            i++;
        }

        return i+1;
    }
}
