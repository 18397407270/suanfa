package test;

import java.util.HashMap;
import java.util.Map;

public class Max_arr {

    public static void main(String[] args) {

        /*求出数组中最大的子数组之和*/

        int a [] = {-2,-2,-3,-5,-2,-6,-1};

        int b [] [] = {{-1,-1,1,1},
                       {-1,-1,2,2},
                       {-1,-1,10,-1}};

        int re = maxRe(a);

        int re2 = maxRe2(b);

        System.out.println(re);

        System.out.println(re2);



    }

    private static int maxRe2(int[][] b) {

        int max = b[0][0];

        int preNum = 0;

        for (int i = 0; i < b.length; i++) {

            for (int j = 0; j < b[i].length; j++) {

                if(preNum>0){

                    preNum += b[i][j];
                }
                else {

                    preNum = b[i][j];
                }

                if(preNum>max){

                    max = preNum;
                }
            }
        }


        return max;
    }

    private static int maxRe(int[] a) {

        int preNum = 0;

        int max = a[0];

        for (int i = 0; i < a.length; i++) {

            if(preNum>0){

                preNum +=a[i];

            }else {

                preNum = a[i];
            }
            if(preNum>max){

                max = preNum;
            }

        }

        return max;
    }
}
