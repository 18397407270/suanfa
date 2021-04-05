package scale;

import java.util.HashMap;
import java.util.Map;

/*找出数组相同的两个数字*/

/*解法二:用进制法*/

public class Find_Two_SameNumber2 {

    public static void main(String[] args) {

        Integer a[] = {1,2,3,4,4,5};

        Integer b = FindNUmber(a);

        System.out.println(b);

    }

    private static Integer FindNUmber(Integer[] a) {

        /*求该数组最大值*/
        int x = -1;
        for(int i=0;i<a.length;i++){
            if(a[i]>=x){
                x = a[i];
            }
        }

        Integer b = 1;
        for(int i =2;i<=x;i++){
            b = b^i;
        }

        Integer c = a[0];

        for (int j = 1;j<a.length;j++){

            c = c^a[j];
        }


        return c^b;
    }
}
