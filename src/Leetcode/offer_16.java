package Leetcode;

import java.util.Arrays;

public class offer_16 {
    public static int threeSumClosest(int[] nums, int target) {
        
        int n = nums.length;

       int min = Integer.MAX_VALUE;

       Arrays.sort(nums);


        for(int i = 0;i<n-2;i++){

            while (i!=0&&nums[i]==nums[i-1]){
                continue;
            }

            int j = i+1;

            int k = n-1;

            while (j<k){

                int sum = nums[i]+nums[j]+nums[k];

                if(sum==target){

                    return target;
                }

                if(Math.abs(sum-target)<Math.abs(min-target)){

                    min = sum;

                }

                if(sum>target){

                    int k0 = k-1;

                    while (k0>j&&nums[k0]==nums[k]){
                        k0--;
                    }

                    k = k0;


                }else {

                    int k0 = j+1;

                    while (k0<k&&nums[k0]==nums[j]){
                        k0++;
                    }

                    j = k0;
                }


            }
        }

        return min;
    }

    public static void main(String[] args) {

        int nums[] = {1,2,4,8,16,32,64,128};

        int target = 82;

        int ans = threeSumClosest(nums, target);

        System.out.println(ans);
    }
}