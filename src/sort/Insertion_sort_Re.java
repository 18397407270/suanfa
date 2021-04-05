package sort;

public class Insertion_sort_Re {

    public static void main(String[] args) {

        int a [] = {4,1,6,3,5,67,6788,1,8788,5};

        int k =a.length;

        insertion_sort(a, k - 1,k);

    }

    private static void insertion_sort(int[] a,int k,int n) {

        if(k==0){

            return ;
        }

        insertion_sort(a,k-1,n);

        int x = a[k];

        int index = k-1;

        while (index>=0&&x<a[index]){
            a[index+1] = a[index];
            a[index] = x;
            index--;
        }

        if(k==n-1){
            for (int i = 0; i < n; i++) {
                System.out.println(a[i]);
            }
        }

    }
}
