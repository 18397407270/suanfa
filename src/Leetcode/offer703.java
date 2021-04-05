package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class offer703 {
    List<Integer> list;
    int kt;
    public offer703(int k, int[] nums) {
        Arrays.sort(nums);
        list=new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++)
            list.add(nums[i]);
        kt=k;
    }
    public int add(int val) {
        if(list.size()==0||val>=list.get(list.size()-1))
            list.add(val);
        else{
            for(int i=0;i<list.size();i++)
            {
                if(list.get(i)>val)
                {
                    list.add(i,val);
                    break;
                }
            }
        }
        return list.get(list.size()-kt);
    }
}