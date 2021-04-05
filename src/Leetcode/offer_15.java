package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class offer_15 {
    /**
     * 三数之和
     * @param nums
     * @return
     */

    public List<List<Integer>> threeSum(int[] nums) {

        int n = nums.length;

        List<List<Integer>> ans = new ArrayList<List<Integer>>();

        Arrays.sort(nums);

        for(int first = 0;first<n;first++){

            if(first>0&&nums[first]==nums[first-1]){
                continue;
            }

            int t = -nums[first];
            int last = n-1;

            for(int second = first+1;second<n;second++){

                if(second>(first+1)&&nums[second]==nums[second-1]){
                    continue;
                }

                while((second<last)&&nums[second]+nums[last]>t){
                    last--;
                }
                if(second==last){
                    break;
                }
                if(nums[second]+nums[last]==t){

                    List<Integer> r = new ArrayList<Integer>();

                    r.add(-t);
                    r.add(nums[second]);
                    r.add(nums[last]);

                    ans.add(r);
                }
            }
        }

        return ans;


    }
}
