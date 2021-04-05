package lanqiao;

public class Odd_Pre_Even {


    public static void main(String[] args) {

        /**
         * 使奇数在偶数前面,时间复杂度在O(n)
         */

        int a[] = {2,3,4,1,2,3,4,3,4,5,6,7,1,2,3,4,5,6,7,8,1};

        int b[]  = new int[a.length];

        int left = 0;

        int right = a.length-1;

        for (int i = 0; i < a.length; i++) {

            if((a[i]&1)==1){
                b[left] =a[i];
                left++;
            }else {
                b[right] = a[i];
                right--;
            }
        }

        for (int i = 0; i < b.length; i++) {

            System.out.print(b[i]+" ");
        }

    }
}
