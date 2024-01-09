//https://leetcode.com/problems/find-the-duplicate-number/  
/* Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.
There is only one repeated number in nums, return this repeated number. nums.length = n+1 */

public class FindDuplicate {
    public static void main(String[] args) {
        int[] nums = {3,1,3,4,2};
        int ans = findDuplicate(nums);
        System.out.println(ans);
    }

    static int findDuplicate(int[] nums) {
        cyclesort(nums);
        return nums[nums.length-1];
    }

    static void cyclesort(int[] arr){
        int i = 0;
        while(i < arr.length){
            int correct = arr[i] - 1; //correct position of element currently present at index i
            if(arr[i] != arr[correct]){
                swap(arr, i, correct);
            }else{
                i++;
            }
        }
    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
