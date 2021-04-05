package lanqiao;

import java.util.Arrays;
import java.util.Comparator;

public class Unique_sort {



    public static void main(String[] args) {

        /*
        * 将一个数组中的所有数字进行拼接,输出最小的拼接数字
        * */


        Integer a [] = {3,32};

        Arrays.sort(a,new Comparator<Integer>(){

            @Override
            public int compare(Integer o1, Integer o2) {

                String s1 = o1+""+o2;
                String s2 = o2+""+o1;

                return s1.compareTo(s2);
            }

        });

        StringBuilder b = new StringBuilder();

        for (int i = 0; i < a.length; i++) {

            b.append(a[i]);
        }

        System.out.println(b.toString());
    }
}
