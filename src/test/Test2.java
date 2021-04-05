package test;

import java.util.Scanner;
public class Test2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("请输入第一个数字");
        int i1 = input.nextInt();

        System.out.println("请输入第二个数字");
        int i2 = input.nextInt();

        System.out.println("请输入第三个数字");
        int i3 = input.nextInt();

        TestMethod(i1,i2,i3);
    }

    private static void TestMethod(int i, int i1, int i2) {

        System.out.println(i+"-"+i1+"+"+i2+"="+(i-i1+i2));

        System.out.println("("+i+"+"+i1+")"+"÷"+i2+"="+(i+i1)/i2);

        System.out.println("("+"-"+"("+i+"-"+i1+")"+"+"+i2+")"+"½"+"="+Math.sqrt(-(i-i1)+5));

        System.out.println("("+i+"×"+i1+"-"+i2+")"+"½"+"="+Math.sqrt(i*i1-i2));

        System.out.println(i+"+"+i2+"-"+i2+"="+(i+i1-i2));

        System.out.println(i+"×"+"("+i1+"-"+i2+")"+"="+i*(i1-i2));

        System.out.println(i+"²"+"-"+i1+"+"+i2+"="+(Math.pow(i,2)-i1+i2));

        System.out.println("("+"("+i+"+"+i1+")"+"÷"+i2+"="+(Math.pow((i+i1)/i2,3)));

        System.out.println("-"+"("+i+"-"+i1+")"+"+"+i2+"="+(-(i-i1)+i2));

        System.out.println("("+"-"+"("+i+"-"+i1+")"+")"+"½"+"×"+i2+"="+Math.sqrt(-(i-i1))*i2);

    }
}
