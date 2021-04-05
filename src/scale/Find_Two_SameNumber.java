package scale;

import java.util.HashMap;
import java.util.Map;

/*找出数组相同的两个数字*/

/*解法一:用hashmap来找出相同数字*/

public class Find_Two_SameNumber {

    public static void main(String[] args) {

        Integer a[] = {1,2,3,4,5,4};

        Integer b = FindNUmber(a);

        System.out.println(b);
    }

    private static Integer FindNUmber(Integer[] a) {

        Map map = new HashMap();

        for (int i = 0;i<a.length;i++){

            if(map.containsKey(a[i])){

                return a[i];
            }
            map.put(a[i],a[i]);
        }

        return null;
    }
}
