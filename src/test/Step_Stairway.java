package test;

import java.util.Scanner;

public class Step_Stairway {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int x = Eval(n);

        System.out.println(x);
    }

    private static int Eval(int n) {


        if(n==1){
            return 1;
        }

        if(n==2){
            return 2;
        }

        if(n==3){
            return 4;
        }

        return Eval(n-1)+Eval(n-2)+Eval(n-3);
    }


}
