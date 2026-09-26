package com.itheima.Exercise;

public class exercise1 {
    public static void main(String[] args) {
        //给你一个数组nums和一个值val 你需要删除数组中所有数值等于val的元素
        int[] nums = {3,2,2,3,0,4,5};
        int val = 2;

        //快慢指针删除数据
        int slow = 0;
        int fast = 1;

        while(fast < nums.length){
            //判断快指针指向的元素是否为2
            if(nums[fast] != val){
                nums[slow] = nums[fast];
                slow++;
            }
            fast++;
        }

        for(int i = 0; i < slow; i++){
            System.out.print(nums[i] + " ");
        }

    }
}
