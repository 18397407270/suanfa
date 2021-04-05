package lanqiao;

public class LongXulie2 {

    public static void main(String[] args) {

        /**
         * 求最长递增子序列
         */

        int a[] = {2,3,4,1,2,3,4,3,4,5,6,7,1,2,3,4,5,6,7,8,1};

        int max = 0;

        //左指针
        int left = 0;
        //右指针
        int right = 0;

        int n = a.length;

        int y = 0;

        //定向左侧在哪里
        int count = 0;

        int i = 0;

        for (i = 1; i < n; i++) {

            if(a[i]>=a[i-1]){
                y = i;

                if((y-count+1)>max){
                    left = count;
                    right = y;
                    max = y-count+1;
                }

            }else {
                count = i;
            }
        }


        for (int x = left; x <=right ; x++) {
            System.out.println(a[x]);
        }

    }
}
