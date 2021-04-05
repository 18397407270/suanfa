package sort;

import java.util.Arrays;

public class Counting_sort {

    /*计数排序*/

    /*思路:扫描待排序数组,找出数组中最大的元素,开辟一个长度为待排序数组中最大值的辅助数组
    * 扫描待排序数组,将待排序数组中的值记为辅助数组的下标
    *
    * 时间复杂度在n+k,但是如果最大值过大,极其浪费数组空间
    *
    * */

    public static void main(String[] args) {


        int a [] = {-6,4,1,6,3,-7,5,67,800,1,1000,5};

        Countingsort2(a);

        System.out.println(Arrays.toString(a));

    }

    private static void Countingsort(int[] a) {

        /**
         * 只存在正数情况
         */

        int max = 0;

        for (int i = 0; i < a.length; i++) {

            if(a[i]>max){
                max = a[i];
            }
        }

        int help[] = new int[max+1];


        for (int i = 0; i < a.length; i++) {

            help[a[i]]++;

        }

        int curr = 0;

        for (int i = 0; i < help.length; i++) {

            while (help[i]>0){

                a[curr++] = i;

                help[i] = help[i] - 1;
            }
        }
    }

    private static void Countingsort2(int[] a) {

        /**
         * 存在正数与负数
         */

        int max = 0;

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < a.length; i++) {

            if(a[i]>max){
                max = a[i];
            }
        }

        for (int i = 0; i < a.length; i++) {

            if(a[i]<min){

                min = a[i];
            }
        }

        min = Math.abs(min);



        int help[] = new int[max+1];

        int help2[] = new int[min+1];


        for (int i = 0; i < a.length; i++) {

            if(a[i]>=0){

                help[a[i]]++;

            }else {

                help2[Math.abs(a[i])]++;

            }



        }

        int curr = 0;

        for (int i = help2.length-1; i >=0; i--) {

            while (help2[i]>0){

                a[curr++] = -i;

                help2[i]--;
            }

        }

        for (int i = 0; i < help.length; i++) {

            while (help[i]>0){

                a[curr++] = i;

                help[i] = help[i] - 1;
            }
        }
    }
}
