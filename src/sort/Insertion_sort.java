package sort;

public class Insertion_sort {

    public static void main(String[] args) {

        int a [] = {4,1,6,3,5,67,6788,1,8788,5};

        insertion_sort(a);

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    public static void insertion_sort(int[] a) {

        int len = a.length;

        for(int i=1;i<len;i++){

            int temp = a[i];

            int j = i-1;

            while(j>=0&&a[j]>temp){

                a[j+1] = a[j];

                j--;
            }

            a[j+1] = temp;
        }

    }
}
