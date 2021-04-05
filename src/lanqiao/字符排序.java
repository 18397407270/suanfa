package lanqiao;

import java.math.BigDecimal;
import java.util.Scanner;

public class 字符排序 {

/*
         * 小蓝最近学习了一些排序算法，其中冒泡排序让他印象深刻。
        在冒泡排序中，每次只能交换相邻的两个元素。
        小蓝发现，如果对一个字符串中的字符排序，只允许交换相邻的两个字符，则在所有可能的排序方案中，冒泡排序的总交换次数是最少的。
        例如，对于字符串 lan 排序，只需要  次交换。对于字符串 qiao 排序，总共需要  次交换。
        小蓝的幸运数字是 ，他想找到一个只包含小写英文字母的字符串，对这个串中的字符进行冒泡排序
        * ，正好需要V 次交换。请帮助小蓝找一个这样的字符串。如果可能找到多个，请告诉小蓝最短的那个。
        * 如果最短的仍然有多个，请告诉小蓝字典序最小的那个。请注意字符串中可以包含相同的字符。
*/

    public static void main(String[] args) {

        BigDecimal bigDecimal = new BigDecimal(71.55);

        BigDecimal bigDecimal1 = bigDecimal.setScale(2, BigDecimal.ROUND_FLOOR);
        BigDecimal bigDecimal2 = bigDecimal.setScale(2,BigDecimal.ROUND_DOWN);
        BigDecimal bigDecimal3 =bigDecimal.setScale(2,BigDecimal.ROUND_UP);
        BigDecimal bigDecimal4 =bigDecimal.setScale(2,BigDecimal.ROUND_CEILING);
        BigDecimal bigDecimal5 =bigDecimal.setScale(2,BigDecimal.ROUND_HALF_EVEN);
        BigDecimal bigDecimal6=bigDecimal.setScale(0,BigDecimal.ROUND_HALF_DOWN);


        System.out.println(bigDecimal);
        System.out.println(bigDecimal1);
        System.out.println(bigDecimal2);
        System.out.println(bigDecimal3);
        System.out.println(bigDecimal4);
        System.out.println(bigDecimal5);
        System.out.println(bigDecimal6);


    }




}
