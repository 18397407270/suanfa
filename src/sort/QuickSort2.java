package sort;


public class QuickSort2 {
    /*
    * 快排使主元在中间
    * */

    public static void main(String[] args) {

        int a [] = {4,1,6,3,6,67,6788,1,8788,5};


         quickSort(a,0,a.length-1);


        for (int i = 0; i < a.length; i++) {

            System.out.println(a[i]);
        }



    }

    private static void quickSort(int[] a, int l, int r) {

        if(l<r){

            /**
             * 当n小于等于8的时候插入排序的性能强于快速排序
             */
            if(r-l+1<=8){
                Insertion_sort.insertion_sort(a);
            }

            int q = Divide(a,l,r);

            quickSort(a,l,q-1);

            quickSort(a,q+1,r);

        }

    }

    public static int Divide(int[] a, int l, int r) {

        /**
         * 将中间值定为主元
         */
        int mid = (r+l)/2;

        int midindex = -1;

        if(a[l]<=a[mid]&&a[l]>=a[r]){
            midindex = l;
        }else if(a[r]<=a[mid]&&a[r]>=a[l]){
            midindex = r;
        }else {
            midindex = mid;
        }

        int temp2 = a[l];

        a[l] = a[midindex];

        a[midindex] = temp2;

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
