package Day11;
//https://leetcode.com/problems/find-peak-element/

public class FindPeakInMountainArr {
    public static void main(String[] args) {
        int[] nums = {1,2,1,3,5,6,4};
        // int[] nums = {1,2};
        // int[] nums = {5,3};   
        
        int ans = findPeakElement(nums);
        System.out.println(ans);
    }

    static int findPeakElement(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        
        while(start<end){
            int mid = start +(end-start)/2;

            if(nums[mid] > nums[mid+1]){//peak is in left of mid
                end = mid;
            }else{//peak is in right of mid
                start = mid+1;
            }
        }
        return start;
    }
}