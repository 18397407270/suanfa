package lanqiao;

import java.util.Scanner;

public class The_least_length {

    public static void main(String[] args) {

        /*
        * 找出一个乱序数组中最短的需要排序的子数组长度
        * */

        int a[] = {2,1,2,2,3,4,6};

        Scanner in  = new Scanner(System.in);

        in.nextInt();

        int left = -1;

        int right = -1;

        int n = a.length;

        int max = a[0];

        //找最右侧
        for (int i = 0; i < n; i++) {

            if(a[i]>max){

                max  = a[i];
            }

            if(a[i]<max){

                right = i;

            }

        }

        int min = a[a.length-1];
        //找最左侧
        for (int i = n-1; i >=0; i--) {

            if(a[i]<min){

                min = a[i];
            }

            if(a[i]>min){

                left = i;

            }
        }

        if(right==-1){

            left=0;
            right=0;
        }

        System.out.println("["+left+","+right+"]");

    }
}
