package sort;

import java.util.Arrays;

public class MergeSort {

    /*归并排序*/

    static int a [] = {4,1,6,3,5,67,6788,1,8788,5};

    public static void main(String[] args) {

        merge_sort(a,0,a.length-1);

        for (int i = 0; i < a.length; i++) {

            System.out.println(a[i]);
        }
    }

    private static void merge_sort(int[] a,int l,int r) {

        if(l<r){

            int mid = (r+l)/2;

            merge_sort(a,l,mid);

            merge_sort(a,mid+1,r);

            merge(a,l,mid,r);
        }
    }

    static int b[] = new int[a.length];

    private static void merge(int[] a, int l, int mid, int r) {

        int left = l;

        int rigth = mid+1;

        int current = l;

        b = Arrays.copyOf(a,a.length);


        while (left<=mid&&rigth<=r){

            if(b[left]<=b[rigth]){

                a[current] = b[left];

                current++;

                left++;
            }else {
                a[current] = b[rigth];

                current++;

                rigth++;
            }
        }

        while (left<=mid){

            a[current] = b[left];

            current++;

            left++;
        }


    }
}
