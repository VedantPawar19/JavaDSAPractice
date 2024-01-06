package Day08;
//Question is to assume array is infinite so cannot use array.length while applying binary search
//So we have to move in chunks to find target
//Source: https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/

public class FindPosInfiniteArr {
    public static void main(String[] args) {
        int[] arr = {1,2,4,6,8,9,12,13,16,19,23,25,27,28,35};
        int target = 23;
        System.out.println(ans(arr, target));
    }

    static int ans(int[] arr, int target){
        int start = 0;
        int end = 1;
        while(target > arr[end]){
            //start = old end + 1 || end = end + length of box*2 // length of box= end-start+1
            int temp = end;
            end = end + (end-start+1) * 2;
            start = temp + 1;
        }
        return BinarySearch(arr, target, start, end);
    }

    static int BinarySearch(int[] arr, int target, int start, int end){

        while(start<=end){
            int mid = start + (end-start)/2;

            if(target>arr[mid]){
                start = mid + 1;
            }else if(target<arr[mid]){
                end = mid -1;
            }else{
                return mid;
            }
        }

        return -1;
    }
}
