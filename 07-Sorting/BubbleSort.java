import java.util.Arrays;

public class BubbleSort{
    public static void main(String[] args){
        // int[] nums = {3,2,1,4,5,6,7};
        int[] nums = {3,2,1,4,5,6,-7};

        bubblesort(nums);
        System.out.println(Arrays.toString(nums));
    }

    static void bubblesort(int[] arr){
        //run loop n-1 times. i is a counter and also does not require to run n times since in the end only one element will be remaining and will be sorted.
        for (int i = 0; i < arr.length-1; i++) {
            boolean swapped = false;
            //do swapping while iterating thorugh j times. Its comparing with previous element so start form 1st index. Also array will start sorting from last element with each iteration that's why n-i times.
            for (int j = 1; j < arr.length - i; j++) {
                if(arr[j] < arr[j-1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }

            if (!swapped) {
                break;
            }            
        }
    }
}