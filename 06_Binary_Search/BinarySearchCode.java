package Day06;

public class BinarySearchCode {
    public static void main(String[] args) {
        int[] arr = {-18,-12,-5,0,3,5,13,22,40,85};
        int target = 3;
        int ans = binarysearch(arr, target);
        System.out.println(ans);

    }
    
    static int binarysearch(int[]arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while (start <= end){
            // int mid = (start+end)/2;
            int mid = start + (end-start)/2;

            if(target>arr[mid]){
                start = mid-1;
            }else if(target<arr[mid]){
                end = mid-1;
            }else{
                //ans found
                return mid;
            }
        }
        return -1;
    }
}
