//https://leetcode.com/problems/search-in-rotated-sorted-array/
//Find pivot index
//both sides are sorted ascending array so apply binary search

public class SearchInRotatedArray {
    public static void main(String[] args) {
        int[] arr = {4};
        int target = 4;
        
        int ans = search(arr, target);
        System.out.println(ans);
    }

    static int search(int[] nums, int target) {
        int pivot = findPivotIndex(nums);
        if(target==nums[0]){
            return 0;
        }else if(target<=nums[0]){
            return binarysearch(nums, target, pivot+1, nums.length-1); 
        }else{
            return binarysearch(nums, target, 0, pivot);
        }
    }

    static int findPivotIndex(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while(start<end){
            int mid = start + (end-start)/2;
            if(arr[mid]>arr[mid+1]){
                return mid;
            }

            if(arr[mid] >= arr[0]){ 
                start = mid + 1;
            } else {
                start = end - 1;
            }
        }
        return start;
    }


    static int binarysearch(int[] arr, int target, int start, int end){
        
        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid]>target){
                end = mid-1;
            }else if(arr[mid]<target){
                start = mid+1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
