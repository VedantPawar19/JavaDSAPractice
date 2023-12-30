package Day7;
//https://leetcode.com/problems/find-smallest-letter-greater-than-target/

public class SmallestLetterGreaterotequaltoTarget {
    public static void main(String[] args){
        char[] arr= {'c','f','j'};
        System.out.println(searchInsert(arr, 'b')); //expected c
        System.out.println(searchInsert(arr, 'c')); //expected f
        System.out.println(searchInsert(arr, 'j')); //expected c
    }

    static char searchInsert(char[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        
        while(start<=end){
            int mid = start + (end-start)/2;
            
            if(target>nums[mid]){
                start = mid + 1;
            }else {
                end = mid - 1;
            }

            
        }

        if (start<nums.length){
            return nums[start];
        }else{
            return nums[0];
        }

        
    }
}
