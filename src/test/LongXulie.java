package test;

public class LongXulie {

    public static void main(String[] args) {

        /**
         * 求最长子序列
         */

        int a[] = {2,3,4,1,2,3,4,3,4,5,6,7};

        int max = 0;

        int left = 0;
        int right = 0;

        int n = a.length;

        for (int k = 1; k < n; k++) {

            int j =0;
            //出发点
            int i = k-1;

            if(n-k+1<max){
                break;
            }

            for (int l = k; l<a.length; l++) {

                if(a[l]>=a[l-1]){
                    j = l;
                    if(j-i+1>max){
                        max = j-i+1;
                        //左边
                        left = i;
                        //右边
                        right = j;
                    }
                }
                else{
                        break;
                }


            }
        }


        for (int x = left; x <=right ; x++) {
            System.out.println(a[x]);
        }

    }
}
