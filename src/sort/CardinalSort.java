package sort;

import java.util.ArrayList;
import java.util.Arrays;

public class CardinalSort {

    /*基数排序*/

    static ArrayList<Integer> [] bucket = new ArrayList[10];

    static {

        for (int i = 0; i < bucket.length; i++) {

            bucket[i] = new ArrayList();
        }
    }

    public static void main(String[] args) {

        int a [] = {-1,4,1,6,3,0,-5,67,800,1,1000,5};

        int min = a[0];

        for (int j : a) {

            if (j < min) {

                min = j;
            }
        }

        min = -min;

        for (int i = 0; i < a.length; i++) {

            a[i] = a[i]+min;
        }

        cardinalSort(a);

        for (int i = 0; i < a.length; i++) {

            a[i] = a[i]-min;

        }

        System.out.println(Arrays.toString(a));
    }

    private static void cardinalSort(int[] a) {


        int max = a[0];

        for (int i = 0; i < a.length; i++) {

            if(a[i]>max){
                max = a[i];
            }
        }

        int d = 1;

        int curr = 1;

        while (max/10!=0){

            d++;

            max = max/10;
        }

        while (curr<=d){

            sort(a,curr++);
        }


    }

    private static void sort(int[] a, int d) {

        for (int i = 0; i < a.length; i++) {

            PutInBucket(a[i],GetDiton(a[i],d));
        }

        int curr = 0;

        for (int i = 0; i < bucket.length; i++) {

            for (Integer l:bucket[i]
                 ) {

                a[curr++] = l;
            }
        }

        ClearAll();
    }

    private static void ClearAll() {

        for (ArrayList a:bucket
             ) {

            a.clear();
        }
    }

    private static void PutInBucket(int i, Integer getDiton) {

        switch (getDiton){

            case 0:
                bucket[0].add(i);
                break;
            case 1:
                bucket[1].add(i);
                break;
            case 2:
                bucket[2].add(i);
                break;
            case 3:
                bucket[3].add(i);
                break;
            case 4:
                bucket[4].add(i);
                break;
            case 5:
                bucket[5].add(i);
                break;
            case 6:
                bucket[6].add(i);
                break;
            case 7:
                bucket[7].add(i);
                break;
            case 8:
                bucket[8].add(i);
                break;
            default:
                bucket[9].add(i);
                break;
        }
    }

    private static Integer GetDiton(int i, int d) {

        int x = 0;

        while (d>0){

            x = i%10;

            i = i/10;

            d--;
        }

        return x;
    }
}
