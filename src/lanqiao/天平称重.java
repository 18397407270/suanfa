package lanqiao;

import java.util.Arrays;
import java.util.Scanner;

public class 天平称重 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int [] res = new int[10];

        int s = 0;

        int pre = 0;

        int re = 0;

        int d = 0;


        for (int i = 1; i<Integer.MAX_VALUE;i = i*3){
            d++;
            if(pre==n){

                System.out.println(i);
            }

            if(pre>n){


                res[s++] = i/3;



                re = n - i/3;

                break;
            }

            pre+=i;
        }

        d = d-1;

        if(re<0){

            int re2 = Math.abs(re);

            while (re2!=0){

                if(re2-(int)Math.pow(3,d)>=0){

                    res[s++] = -(int)Math.pow(3,d);

                    re2 = re2-(int)Math.pow(3,d);

                }else {

                    d--;

                }
            }
        }else {

            int re2 = Math.abs(re);

            while (re2!=0){

                if(re2-(int)Math.pow(3,d)>=0){

                    res[s++] = (int)Math.pow(3,d);

                    re2 = re2-(int)Math.pow(3,d);

                }else {

                    d--;

                }
            }
        }

        System.out.println(Arrays.toString(res));

    }
}
