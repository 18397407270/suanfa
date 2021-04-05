package test;

import java.util.*;

public class Test {

    public static void demo3(){

        System.out.println(3%7);

        System.out.println(3*5/2);

        Map<Integer,Integer> map = new HashMap<>();


        
    }

    public static void demo(){
        int [] a={1,2,3,4};

        int [] b= new int[32];

        a = b;

        b[1]  = 1;

        for (int i = 0; i<a.length;i++){

            System.out.println(a[i]);
        }
    }

    public static void demo2(){

        String a = "ab";

        String b = "ab";




        System.out.println(a==b);
    }

    public static void demo4(){

        for (int i = 65; i <=90 ; i++) {

            char s = (char)i;

            System.out.print(s+" ");
        }


        Integer i = new Integer("01");

        System.out.println(i);
    }

    public static void demo5(){

        Set set = new HashSet();

        set.add("123");

        System.out.println(set.add("123"));
    }



    public static void main(String[] args) {

        //demo2();

        //demo3();

        demo5();

    }
}
