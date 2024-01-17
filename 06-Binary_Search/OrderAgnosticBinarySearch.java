public class OrderAgnosticBinarySearch{
    public static void main(String[] args){
        //Give array is Order agnostic. It is sorted but we do not know if ascending or descending order.
        //Search element using binary search in that array and return index of that number if found.

        int[] arr = {-18,-12,-5,0,3,5,13,22,40,85};
        int target = 3;
        int ans = OAbinarysearch(arr, target);
        System.out.println(ans);
    }

    static int OAbinarysearch(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

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