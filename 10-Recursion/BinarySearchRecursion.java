public class BinarySearchRecursion {
    public static void main(String[] args){
        // return the index of target in array nums if not found return -1.
        int target = 60;
        int[] nums = {2,4,5,7,9,13,15,17,35};
        int result = BinarySearch(nums, target, 0, nums.length-1);
        System.out.println(result);
    }

    static int BinarySearch(int[] nums, int target, int left, int right){
        if(left > right){
            return -1;
        }
        
        int mid = left + (right - left)/2;

        if(nums[mid] == target){
            return mid;
        }else if (nums[mid] > target){
            return BinarySearch(nums, target, left, mid - 1);
        }else{
            return BinarySearch(nums, target, mid + 1, right);
        }
    }
}
