package sort;

/*选择排序*/
public class Selection_sort_1 {

    public static void main(String[] args) {

        int a [] = {4,1,6,3,5,67,6788,1,8788,5};

        Long s = System.currentTimeMillis();
        selection_sort(a);

        Long e = System.currentTimeMillis()-s;

        System.out.println("时间"+e);
    }

    private static void selection_sort(int[] a) {

        int pos = 0;

        for (int i = 0;i<a.length;i++){

            pos = i;

            for (int j = i+1; j < a.length; j++) {

                if(a[pos]>a[j]){
                    pos = j;
                }

            }

            if(i!=pos){

                int temp = a[i];

                a[i] = a[pos];

                a[pos] = temp;
            }

        }

        for (int i = 0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
