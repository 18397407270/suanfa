package lanqiao;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Equal_K {

    public static void main(String[] args) {

        /**
         * 从排序数组中找出相加等于k的不降序的双元组
         */

        ArrayList<ArrayList> list = new ArrayList<>();


        int [] a = {-8,-4,-3,0,2,4,5,8,9,10};

        int left = 0;

        int k = 10;

        int right = a.length-1;

        while (left<right){

            if(a[left]+a[right]<k){

                left++;
            }else if(a[left]+a[right]>k){

                right--;
            }else {

                ArrayList list1 = new ArrayList();

                list1.add(a[left]);

                list1.add(a[right]);

                list.add(list1);

                left++;

            }
        }

        list.stream().forEach(s-> System.out.println(s));


    }
}
