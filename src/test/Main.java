package test;

import java.util.Scanner;

public class Main{
    
    public static void main(String [] args){
        
        Scanner in  = new Scanner(System.in);
        
        int n = in.nextInt();//数组长度
        
        int q = in.nextInt();//询问次数
        
        int [] a = new int[n+1];

        int [] b= new int[n+1];

        
        for(int i = 1;i<=n;i++){
            
            a[i] = in.nextInt();
            
        }


        while((q--)>0){


            int l = in.nextInt();
            int r = in.nextInt();
            int x = in.nextInt();

            int num = 0;

            for (int i = l; i <=r ; i++) {

                if(a[i]%x==0){

                    num++;
                }
            }

            System.out.println(num);
        }
        
        
    }
    
}