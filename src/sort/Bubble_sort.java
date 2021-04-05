package sort;

/*冒泡排序*/
public class Bubble_sort {

    public static void main(String[] args) {

        int a [] = {4,1,6,3,5,67,6788,1,8788,5};

        bubble_sort(a);
    }

    private static void bubble_sort(int[] a) {

        for (int i = 0; i < a.length-1; i++) {

            for (int j = 0; j < a.length-i-1; j++) {

                int temp = 0;

                if(a[j]>a[j+1]){

                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;

                }
            }

        }

        for (int i = 0; i < a.length; i++) {

            System.out.println(a[i]);
        }
    }
}
