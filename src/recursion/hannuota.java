package recursion;

import java.util.Scanner;

class TowersOfHanoi {
    static int m =0;//标记移动次数
    //实现移动的函数
    public static void move(int disks,char N,char M)
    {
        System.out.println("第" + (++m) +" 次移动 : " +" 把 "+ disks+" 号圆盘从 " + N +" ->移到->  " + M);
    }
    //递归实现汉诺塔的函数
    public static void hanoi(int n,char from,char help,char to)
    {
        if(n == 1)//圆盘只有一个时，只需将其从A塔移到C塔
            TowersOfHanoi.move(1, from, to);//将编号为1的圆盘从源空间移到目的空间
        else
        {//否则
            hanoi(n - 1, from, to, help);//递归，将源空间的N-1个盘子给辅助盘
            TowersOfHanoi.move(n, from, to);//把源空间上编号为n的圆盘移到目的空间上
            hanoi(n - 1, help, from, to);//递归
        }
    }
    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);
        char A = 'A';
        char B = 'B';
        char C = 'C';
        System.out.println("******************************************************************************************");
        System.out.println("这是汉诺塔问题（把A塔上编号从小号到大号的圆盘从A塔通过B辅助塔移动到C塔上去");
        System.out.println("******************************************************************************************");
        System.out.print("请输入圆盘的个数：");
        int disks = imput.nextInt();
        TowersOfHanoi.hanoi(disks, A, B, C);
        System.out.println(">>移动了" + m + "次，把A上的圆盘都移动到了C上");
        imput.close();
    }

}