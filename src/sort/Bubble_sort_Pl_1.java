package sort;

/*冒泡排序*/
public class Bubble_sort_Pl_1 {

    public static void main(String[] args) {

        int a [] = {4,1,6,3,5,67,6788,1,8788,5};

        bubble_sort(a);
    }

    private static void bubble_sort(int[] a) {

        for (int i = 0; i < a.length-1; i++) {

            //增加标记,如果已经有序,那么这个flag就一直为true
            boolean flag = true;

            for (int j = 0; j < a.length-i-1; j++) {

                int temp = 0;

                if(a[j]>a[j+1]){

                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;

                    flag = false;

                }
            }

            if(flag){
                break;
            }

        }

        for (int i = 0; i < a.length; i++) {

            System.out.println(a[i]);
        }
    }
}
