package sort;

import java.util.*;

public class BucketSort {

    /**
     * 桶排序
     * @param args
     */

    public static void main(String[] args) {


        int a [] = {-6,4,1,6,3,-7,5,67,800,1,1000,5};

        backetsort(a);

        System.out.println(Arrays.toString(a));
    }

    private static void  backetsort(int[] a) {

        int min = a[0];

        int max = a[0];

        //找出最小值与最大值
        for (int i = 1; i < a.length; i++) {

            if(a[i]<min){
                min = a[i];
            }

            if(a[i]>max){
                max = a[i];
            }
        }

        int d = max - min;

        //初始化


        /**
         * 将桶的数量定位数组长度的一般
         */
        List<LinkedList<Integer>> bucket = new ArrayList<>(a.length/2);

        for (int i = 0; i < a.length/2; i++) {

            bucket.add(new LinkedList<>());

        }

        for (int i = 0; i < a.length; i++) {

            //放到哪个桶里面,公式需要自己推一下

            int num = ((a[i]-min)/d*(a.length/2-1));

            bucket.get(num).add(a[i]);
        }

        //对每个桶内的数据进行排序
        for (int i = 0; i < a.length/2; i++) {

            Collections.sort(bucket.get(i));

        }

        int index = 0;

        for (LinkedList<Integer> list:bucket
             ) {

            for (Integer i:list
                 ) {

                a[index] = i;

                index++;
            }
        }


    }
}
