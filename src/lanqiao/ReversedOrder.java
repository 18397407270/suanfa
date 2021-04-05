package lanqiao;

import java.util.Arrays;

public class ReversedOrder {

    /**
     * 求逆序对
     */

    static int a [] = {4,1,6,3,5,67,6788,1,8788,5};

    static int b[] = new int[a.length];

    static int re = 0;

    public static void main(String[] args) {

        FindReversedOrder(a,0,a.length-1);


        for (int i = 0; i < a.length; i++) {

            System.out.print(a[i]+" ");
        }

        System.out.println(re);
    }

    private static void FindReversedOrder(int[] a, int l, int r) {

        if(l<r){
            int mid = (l+r)/2;
            FindReversedOrder(a,l,mid);
            FindReversedOrder(a,mid+1,r);
            merge(a,l,mid,r);
        }



    }

    private static void merge(int[] a, int l, int mid, int r) {

        int left = l;

        int right = mid+1;

        int current = l;

        b = Arrays.copyOf(a,a.length);

        while (left<=mid&&right<=r){

            if(b[left]<=b[right]){
                a[current++] = b[left++];
            }else {
                a[current++] = b[right++];
                re +=mid-left+1;
            }
        }

        while (left<=mid){

            a[current++] = b[left++];

        }

    }
}
