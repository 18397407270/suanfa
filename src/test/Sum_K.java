package test;

import java.util.HashMap;
import java.util.Map;

public class Sum_K {

    /*能被k整除的连续非空数组*/

    public static void main(String[] args) {

        int a[] = {4,5,0,-2,-3,1};

        int prenum = 0;

        int count = 0;

        int k = 5;

        Map<Integer,Integer> map = new HashMap();

        map.put(0,1);


        for (Integer i:a) {

            prenum+=i;

            int key = (prenum%k+k)%k;

            if(map.containsKey(key)){

                count += map.get(key);
            }

            map.put(key,map.getOrDefault(key,0)+1);
        }

        System.out.println(count);

    }


}
