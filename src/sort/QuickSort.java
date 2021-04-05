package sort;

public class QuickSort {

    public static void main(String[] args) {

        int a [] = {4,1,6,3,5,67,6788,1,8788,5};


         quickSort(a,0,a.length-1);


        for (int i = 0; i < a.length; i++) {

            System.out.println(a[i]);
        }



    }

    private static void quickSort(int[] a, int l, int r) {

        if(l<r){

            int q = Divide(a,l,r);

            quickSort(a,l,q-1);

            quickSort(a,q+1,r);

        }

    }

    private static int Divide(int[] a, int l, int r) {

        int q = a[l];

        int temp = 0;

        while (l<r){

            while (l<r&&a[r]>=q){

                r--;

            }

            temp = a[r];

            a[r] = a[l];

            a[l] = temp;

            while (l<r&&a[l]<=q){
                l++;
            }

            temp = a[l];

            a[l] = a[r];

            a[r] = temp;
        }

        return l;

    }
}
