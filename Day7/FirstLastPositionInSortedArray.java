package Day7;

import java.util.Arrays;

// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
public class FirstLastPositionInSortedArray {
    public static void main(String[] args) {
        int[] arr = {2,4,4,4,4,4,9,11,15};
        int target = 4;
        int[] ans = searchRange(arr, target);
        System.out.println(Arrays.toString(ans));
    }

    static int[] searchRange(int[] nums, int target) {
       int[] ans = {-1,-1};
       
       int startIndex = SearchOne(nums, target, true);
       int endIndex = SearchOne(nums, target, false);
       
       ans[0] = startIndex;
       ans[1] = endIndex;

       return ans;
    }

    static int SearchOne(int[] nums, int target, boolean findStartIndex){
        int start = 0;
        int end = nums.length-1;
        int index = -1;

        while(start<=end){
            int mid = start + (end-start)/2;

            if (target>nums[mid]){
                start = mid+1;
            }else if (target < nums[mid]){
                end = mid-1;
            }else{
                index = mid;
                if (findStartIndex){
                    end = mid-1;
                }else{
                    start = mid+1;
                }
            }
       }
       return index;
    }
}
