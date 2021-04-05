package test;

import java.util.Scanner;

public class 蓝桥日历 {

    public static void main(String[] args) {


        Scanner in  =new Scanner(System.in);

        int n  = in.nextInt();

        String s = d(n);

        System.out.println(s);
    }

    private static String d(int n) {

        int y = 1777;

        int m = 4;

        int d = 30;

        int dd [] = {0,31,28,31,30,31,30,31,31,30,31,30,31};

        n = n-1;

        while (n-->0){

            if(JudgeRun(y)){

                dd[2] = 29;
            }else {
                dd[2] = 28;
            }

            if(dd[m]==d){
                m++;
                d = 1;
            }
            else {
                d++;
            }

            if(m==13){
                y++;
                m = 1;
            }


        }

        return y+"-"+m+"-"+d;


    }

    public static boolean JudgeRun(int n){

        return (n%4==0&&n%100!=0)||n%400==0;
    }
}
