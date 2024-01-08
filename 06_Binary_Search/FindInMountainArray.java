//Find target in bitonic or mountain array for example [1,2,3,4,5,3,1]
//Question is from leetcode but there it is interactive problem so some modifications needed in code but for now Solve in default way.
public class FindInMountainArray {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,3,1};
        int target = 3;
        int ans = search(arr, target);
        System.out.println(ans);

    }

    static int search(int[] arr, int target){
        int peak = findPeakElement(arr);

        int firsttry = OAbinarysearch(arr, target, 0, peak);
        if(firsttry!=-1){
            return firsttry;
        }
        return OAbinarysearch(arr, target, peak+1, arr.length-1);
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

    static int OAbinarysearch(int[] arr, int target, int start, int end){

        boolean isAsc = arr[start]<arr[end];

        while(start <= end){
            int mid = start + (end-start)/2;

            if (arr[mid]==target){
                return mid;
            }

            if (isAsc){
                if(target>arr[mid]){
                    start = mid-1;
                }else{
                    end = mid-1;
                }
            }
            else{
                if(target<arr[mid]){
                    start = mid-1;
                }else{
                    end = end-1;
                }
            }
        }
        return -1;
    }
}
