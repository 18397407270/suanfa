package sort;

/*选择排序*/
public class Selection_sort {

    public static void main(String[] args) {

        int a [] = {4,1,6,3,5,67,6788,1,8788,5};

        Long s = System.currentTimeMillis();
        selection_sort(a);

        Long e = System.currentTimeMillis()-s;

        System.out.println("时间"+e);
    }

    private static void selection_sort(int[] a) {

        int pos = 0;

        int pos1 = a.length-1;


        for (int i = 0;i<a.length;i++){

            pos = i;

            pos1= i;

            boolean flag = true;


            for (int j = i+1; j < a.length-i; j++) {

                if(a[pos]>a[j]){
                    pos = j;
                    flag = false;
                }

                if(a[pos1]<a[j]){
                    pos1 = j;
                    flag = false;
                }

            }

            if(flag){
                break;
            }

            if(i!=pos){
                int temp = a[i];

                a[i] = a[pos];

                a[pos] = temp;
            }

            //出现最大值在最左边或者最小值在最右边
            if(i==pos1||pos==(a.length-1-i)){

                int temp1 = a[a.length-i-1];

                a[a.length-i-1] = a[pos];

                a[pos] = temp1;
            }

            //最大值不在最右边,且最大值不在最左边和最小值不在最右边
            if(pos1!=a.length-i-1&&(pos!=(a.length-1-i)&&pos1!=i)){

                int temp1 = a[a.length-i-1];

                a[a.length-i-1] = a[pos1];

                a[pos1] = temp1;
            }

        }

        for (int i = 0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
