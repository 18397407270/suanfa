package test;

import java.math.BigDecimal;
import java.util.Scanner;

public class 成绩分析 {

    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int c [] = new int[n];

        for (int i = 0; i < n; i++) {

            c[i] = in.nextInt();
        }

        int min = c[0];

        int max = c[0];

        double sum = 0;

        for (int i = 0; i < n; i++) {

            if(c[i]<min){
                min = c[i];
            }
            if(c[i]>max){
                max = c[i];
            }

            sum+=c[i];
        }

        double avg = sum/(n*1.0);


        System.out.println(max);
        System.out.println(min);
        System.out.printf("%.2f\n",avg);

    }
}
