import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] nums = {3,0,2,1,4,5,6,-7};

        insertion(nums);
        System.out.println(Arrays.toString(nums));
    }

    static void insertion(int[] arr){
        for (int i = 0; i <= arr.length - 2; i++) {
            for (int j = i + 1; j > 0; j--) {
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }else{
                    break;
                }
            }
        }
    }
}
