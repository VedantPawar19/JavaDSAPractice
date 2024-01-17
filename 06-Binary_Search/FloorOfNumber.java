//Smallest number greater than equal to target
public class FloorOfNumber{
    public static void main(String[] args) {
        int[] arr= {2,3,5,8,12,45};
        System.out.println(searchInsert(arr, 10));
    }

    static int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        
        while(start<=end){
            int mid = start + (end-start)/2;
            
            if(target>nums[mid]){
                start=mid+1;
            }else if(target<nums[mid]){
                end=mid-1;
            }else{
                return nums[mid];
            }
        }
        return nums[end];
    }
}