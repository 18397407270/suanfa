package sort;

import java.util.Arrays;

public class HeapSort2 {

    /**
     * 小顶堆
     * @param args
     */


    public static void main(String[] args) {

        int a [] = {4,1,6,3,5,67,6788,1,8788,5};

        heapsort(a);

        System.out.println(Arrays.toString(a));

    }

    public static void heapsort(int[] a) {

        int n = a.length;

        //将无序数组构建成大顶堆
        for (int i = (n-2)/2; i >=0; i--) {

            downAdjust(a,i,n);

        }

        for (int i = n-1; i >0 ; i--) {

            int temp = a[i];

            a[i] = a[0];

            a[0] = temp;

            downAdjust(a,0,i);

        }



    }

    private static void downAdjust(int[] a, int i, int n) {

        int temp = a[i];

        int child  = 2*i+1;

        while (child<n){

            //当存在右孩子的时候,并且右孩子的值大于左孩子的时候

            if(child+1<n&&a[child+1]<a[child]){
                child++;
            }

            //当父节点大于任何一个孩子节点直接跳出

            if(temp<=a[child]){
                break;
            }

            a[i] = a[child];

            i = child;

            child = 2*child+1;
        }

        a[i] = temp;


    }
}
