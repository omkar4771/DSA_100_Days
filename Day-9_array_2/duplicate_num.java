// package Day-9_array_2;

// Given an integer array nums, return true if any value appears at least twice in the array, and 
// return false if every element is distinct

import java.util.Arrays;

public class duplicate_num {
    public static boolean duplicate(int nums[]){
        Arrays.sort(nums);

        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 4};
        System.out.println(duplicate(nums));

       
    }
}
