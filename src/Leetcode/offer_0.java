package Leetcode;

import java.util.HashMap;
import java.util.Map;

public class offer_0{
/*求一个整形数组中两个数之和等于某一个数*/
    public static void main(String[] args) {

        int [] a = {1,4,6,8,10};

        find(a,11);
    }

    private static void find(int[] a,int b) {
        Map map = new HashMap();
        for(int i=0;i<a.length;i++){
            int c = b - a[i];

            if(map.containsValue(c)){
                System.out.println(c);
                System.out.println(a[i]);
            }
            map.put(i,a[i]);
        }

        System.out.println("数组中没有两个数的和等于"+b);
    }
}
