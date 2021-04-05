package test;

import java.util.Scanner;

public class 最长字符 {

    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);

        String s = in.next();

        char[] m = s.toCharArray();

        int a [] = new int[128];

        for (int i = 0; i < m.length; i++) {

            a[m[i]]++;

        }

        int max = a[0];

        char c = ' ';

        for (int i = 1; i < a.length; i++) {

            if(a[i]>max){
                max = a[i];
                c = (char) i;
            }
        }

        System.out.println(c);

        System.out.println(max);


    }
}
