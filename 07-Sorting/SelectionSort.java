import java.util.Arrays;

public class SelectionSort{
    public static void main(String[] args){
        // int[] nums = {3,2,1,4,5,6,7};
        int[] nums = {3,0,2,1,4,5,6,-7};

        selection(nums);
        System.out.println(Arrays.toString(nums));
    }

    static void selection(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr, 0, last);
            //swap max with last element
            int temp = arr[maxIndex];
            arr[maxIndex] = arr[last];
            arr[last] = temp;
        }
    }

    static int getMaxIndex(int[] arr, int start, int end) {
        int max = start;
        for(int i = 0; i<=end; i++){
            if(arr[max]<arr[i]){
                max = i;
            }
        }
        return max;
    }
}