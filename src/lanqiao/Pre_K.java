package lanqiao;

import java.util.Arrays;
import java.util.Scanner;

public class Pre_K {

    /*
    * 按照逆序排序求前K个数
    * */

    static int k = 0;

    static int size = 0;

    static int [] a;





    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        k = in.nextInt();

        a = new int[k];

        int q = in.nextInt();

        while (q!=-1){

            query(q);

            q = in.nextInt();
        }

    }

    private static void query(int q) {

        if(size<k){

            a[size++] = q;

            if(size==k){

                MinHeap(a);

                size++;
            }

        }else {

            if(q>a[0]){

                a[0] = q;

                MinHeap(a);
            }

            System.out.println(Arrays.toString(a));
        }


    }

    private static void MinHeap(int[] a) {

        int n = a.length;

        for (int i = (a.length-2)/2; i >=0; i--) {

            downjust(a,i,n);

        }

        for (int i = n-1; i >0 ; i--) {

            int temp = a[i];

            a[i] = a[0];

            a[0] = temp;

            downjust(a,0,n);
        }
    }

    private static void downjust(int[] a, int i, int n) {

        int child = 2*i+1;

        int temp = a[i];

        while (child<n){

            if(child+1<n&&a[child]>a[child+1]){
                child++;
            }

            if(a[i]<a[child]){
                break;
            }

            a[i] = a[child];

            i  = child;

            child = child*2+1;
        }

        a[i] = temp;
    }
}
