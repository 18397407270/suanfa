package lanqiao;

import sort.QuickSort2;

public class K {

    /*求一个乱序数组中第k小的数*/

    public static void main(String[] args) {


        int a [] = {4,1,6,3,5,67,6788,1,8788,5};

        int k = 1;

        int r = SelectK(a,k,0,a.length-1);

        System.out.println(r);
    }

    private static int SelectK(int [] a,int k,int l,int r) {

        int q = QuickSort2.Divide(a,l,r);

        int Qk = q+1;

        if(Qk==k){
            return a[q];
        }else if(k<Qk){
            return SelectK(a,k,l,q-1);
        }else {
            return SelectK(a,k,q+1,r);
        }

    }
}
