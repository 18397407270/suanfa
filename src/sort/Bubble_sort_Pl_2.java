package sort;

/*冒泡排序*/
public class Bubble_sort_Pl_2 {

    public static void main(String[] args) {

        int a [] = {4,1,6,3,5,67,6788,1,8788,5};

        bubble_sort(a);
    }

    private static void bubble_sort(int[] a) {

        int Last = a.length-1;//最后交换的位置

        int LastBorder = a.length-1;//边界(边界之后是有序的,无需参与排序)

        for (int i = 0; i < a.length-1; i++) {

            //增加标记,如果已经有序,那么这个flag就一直为true
            boolean flag = true;

            for (int j = 0; j < LastBorder; j++) {

                int temp = 0;

                if(a[j]>a[j+1]){

                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;

                    Last = j;
                    flag = false;

                }
            }

            //把最后交换的位置赋给边界
            LastBorder = Last;

            if(flag){
                break;
            }

        }

        for (int i = 0; i < a.length; i++) {

            System.out.println(a[i]);
        }
    }
}
